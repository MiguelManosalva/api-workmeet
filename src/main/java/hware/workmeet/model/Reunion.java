package hware.workmeet.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "reunion")
public class Reunion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReunion;

	@Size(min = 5, message = "Asunto debe tener al menos 5 caracteres")
	@Column(name = "asunto", nullable = false, length = 50)
	private String asunto;

	@Size(min = 5, message = "Lugar debe tener al menos 5 caracteres")
	@Column(name = "lugar", nullable = true, length = 50)
	private String lugar;

	@Size(min = 5, message = "Descripción debe tener al menos 5 caracteres")
	@Column(name = "descripcion", nullable = true, length = 500)
	private String descripcion;

	private LocalDateTime fechaInicio;

	private LocalDateTime fechaFin;

	public Integer getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Integer idReunion) {
		this.idReunion = idReunion;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idReunion == null) ? 0 : idReunion.hashCode());
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
		Reunion other = (Reunion) obj;
		if (idReunion == null) {
			if (other.idReunion != null)
				return false;
		} else if (!idReunion.equals(other.idReunion))
			return false;
		return true;
	}

}
