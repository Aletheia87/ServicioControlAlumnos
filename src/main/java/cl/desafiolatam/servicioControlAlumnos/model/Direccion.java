package cl.desafiolatam.servicioControlAlumnos.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@SequenceGenerator(name="SQ_DIRECCION", initialValue=1, allocationSize=1)
public class Direccion {
	
	@Id

	@GeneratedValue(strategy= GenerationType.SEQUENCE,
	generator="SQ_DIRECCION")
	private int id;
	private String calle;
	private String numero;
	private String ciudad;
	@Enumerated(value = EnumType.STRING) 
	private TipoDireccion tipo;

}
