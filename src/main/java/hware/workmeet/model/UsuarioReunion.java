package hware.workmeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_reunion")
@IdClass(UsuarioReunionPK.class)
public class UsuarioReunion {

	@Id
	private Usuario usuario;

	@Id
	private Reunion reunion;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

}
