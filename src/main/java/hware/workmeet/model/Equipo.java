package hware.workmeet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "equipo")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idEquipo;
	
	@Size(min=3, message = "Nombre debe tener al menos 3 caracteres")
	@Column(name = "nombre", nullable=false, length=50)
	private String nombre;
	
	@Size(min=5, message = "Nombre debe tener al menos 5 caracteres")
	@Column(name = "descripcion", nullable=false, length=250)
	private String descripcion;

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
