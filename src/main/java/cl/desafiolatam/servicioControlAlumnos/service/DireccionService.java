package cl.desafiolatam.servicioControlAlumnos.service;

import java.util.List;

import cl.desafiolatam.servicioControlAlumnos.model.Direccion;

public interface DireccionService {

	public void save(Direccion direccion);
	public List<Direccion> findAll();
}
