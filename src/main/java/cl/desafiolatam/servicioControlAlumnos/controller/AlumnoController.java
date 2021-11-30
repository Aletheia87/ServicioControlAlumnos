package cl.desafiolatam.servicioControlAlumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.servicioControlAlumnos.model.Alumno;
import cl.desafiolatam.servicioControlAlumnos.service.AlumnoService;
import cl.desafiolatam.servicioControlAlumnos.service.DireccionService;


@Controller
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	DireccionService direccionService;
	
	@RequestMapping("/alumnos")
	public String alumnos(Model model) {
		model.addAttribute("alumnos",alumnoService.findAll());
		
		return "alumnos";
	}
	
	@GetMapping("/formularioAlumno")
	public String formularioAlumno(Model model) {
		model.addAttribute("direcciones", direccionService.findAll());
		
		return "crear-alumno";
		
	}
	
	
	@PostMapping("/agregarAlumno")
	public String agregarAlumno (@ModelAttribute Alumno alumno, Model model ) {
		alumnoService.save(alumno);
		
		return "alumnos";
		
	}
}

