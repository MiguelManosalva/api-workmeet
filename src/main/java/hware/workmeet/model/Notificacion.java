package hware.workmeet.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "notificacion")
public class Notificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNotificacion;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false, foreignKey = @ForeignKey(name = "FK_notificacion_usuario"))
	private Usuario usuario;

	@OneToMany(mappedBy = "notificacion", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<DetalleNotificacion> detalleNotificacion;

	public Integer getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleNotificacion> getDetalleNotificacion() {
		return detalleNotificacion;
	}

	public void setDetalleNotificacion(List<DetalleNotificacion> detalleNotificacion) {
		this.detalleNotificacion = detalleNotificacion;
	}



}
