package cl.desafiolatam.servicioControlAlumnos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.servicioControlAlumnos.model.Alumno;
import cl.desafiolatam.servicioControlAlumnos.repository.AlumnoRepository;
import cl.desafiolatam.servicioControlAlumnos.service.AlumnoService;


@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Override
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);
		
	}

	@Override
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoRepository.findAll();
	}

}
