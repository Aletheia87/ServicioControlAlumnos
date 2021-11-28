package cl.desafiolatam.servicioControlAlumnos.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private Date fechaIngreso;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_direccion", referencedColumnName = "id")
	private Direccion direccion;

}