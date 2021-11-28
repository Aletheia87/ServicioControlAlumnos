package cl.desafiolatam.servicioControlAlumnos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.servicioControlAlumnos.model.Direccion;
import cl.desafiolatam.servicioControlAlumnos.repository.DireccionRepository;
import cl.desafiolatam.servicioControlAlumnos.service.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService {

	@Autowired				
	DireccionRepository direccionRepository;
	
	@Override
	public void save(Direccion direccion) {
		direccionRepository.save(direccion);
	}

	@Override
	public List<Direccion> findAll() {
		return (List<Direccion>)direccionRepository.findAll();
	}

}
