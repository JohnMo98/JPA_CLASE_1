package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Empleado {

	@Id
	@GeneratedValue
	
	private Long id;
	private String nombre;
	
	@ManyToOne
	private Departamento depa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Departamento getDepa() {
		return depa;
	}
	public void setDepa(Departamento depa) {
		this.depa = depa;
	}
	
	
}
