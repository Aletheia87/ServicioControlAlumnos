package cl.desafiolatam.servicioControlAlumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.servicioControlAlumnos.model.Direccion;
import cl.desafiolatam.servicioControlAlumnos.service.DireccionService;


@Controller
public class DireccionController {

	@Autowired
	DireccionService direccionService;
	
	@RequestMapping("/direcciones")
	public String direcciones(Model model){
		model.addAttribute("direcciones", direccionService.findAll());
		
		return "direcciones";
	}
	
	@GetMapping("/formularioDireccion")
	public String formularioDireccion() {
		return"crear-direccion";
	}
	
	@PostMapping("/agregarDireccion")
	public String agregarDireccion(@ModelAttribute Direccion direccion, Model model) {
		direccionService.save(direccion);
		
		return formularioDireccion();
	}
	
}
