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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEquipo;

	@Size(min = 3, message = "Nombre debe tener al menos 3 caracteres")
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Size(min = 5, message = "Descripción debe tener al menos 5 caracteres")
	@Column(name = "descripcion", nullable = false, length = 250)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEquipo == null) ? 0 : idEquipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (idEquipo == null) {
			if (other.idEquipo != null)
				return false;
		} else if (!idEquipo.equals(other.idEquipo))
			return false;
		return true;
	}

}
