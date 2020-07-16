package hware.workmeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_tarea")
@IdClass(UsuarioTareaPK.class)
public class UsuarioTarea {

	@Id
	private Usuario usuario;

	@Id
	private Tarea tarea;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

}
