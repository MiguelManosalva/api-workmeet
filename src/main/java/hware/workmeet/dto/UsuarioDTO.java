package hware.workmeet.dto;

import org.springframework.hateoas.ResourceSupport;

import hware.workmeet.model.Equipo;
import hware.workmeet.model.Reunion;
import hware.workmeet.model.Tarea;

public class UsuarioDTO extends ResourceSupport{
	
	private Integer idUsuario;
	private Reunion reunion;
	private Tarea tarea;
	private Equipo equipo;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Reunion getReunion() {
		return reunion;
	}
	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}
	public Tarea getTarea() {
		return tarea;
	}
	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	
}
