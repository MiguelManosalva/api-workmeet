package hware.workmeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_equipo")
@IdClass(UsuarioEquipoPK.class)
public class UsuarioEquipo {

	@Id
	private Usuario usuario;

	@Id
	private Equipo equipo;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
