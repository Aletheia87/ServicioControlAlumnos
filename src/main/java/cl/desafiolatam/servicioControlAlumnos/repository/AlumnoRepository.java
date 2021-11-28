package cl.desafiolatam.servicioControlAlumnos.repository;

import org.springframework.data.repository.CrudRepository;

import cl.desafiolatam.servicioControlAlumnos.model.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{

}
