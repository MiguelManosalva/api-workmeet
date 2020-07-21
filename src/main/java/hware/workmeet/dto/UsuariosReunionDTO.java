package hware.workmeet.dto;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import hware.workmeet.model.Reunion;
import hware.workmeet.model.Usuario;

public class UsuariosReunionDTO extends ResourceSupport {

	private List<Usuario> usuarios;
	private Reunion reunion;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

}
