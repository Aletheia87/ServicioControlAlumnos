package cl.desafiolatam.servicioControlAlumnos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "direccion")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	private String calle;
	private String numero;
	private String ciudad;
	private TipoDireccion tipo;

}
