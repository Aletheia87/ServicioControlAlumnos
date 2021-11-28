package cl.desafiolatam.servicioControlAlumnos.service;

import java.util.List;

import cl.desafiolatam.servicioControlAlumnos.model.Alumno;


public interface AlumnoService {
	
	public void save(Alumno alumno);
	public List<Alumno> findAll();

}
