package cl.desafiolatam.servicioControlAlumnos.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="SQ_ALUMNO", initialValue=1, allocationSize=1)
public class Alumno {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,
	generator="SQ_ALUMNO")
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private String fechaIngreso;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;

}