package hware.workmeet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "detalle_notificacion")
public class DetalleNotificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalle;

	@ManyToOne
	@JoinColumn(name = "id_notificacion", nullable = false, foreignKey = @ForeignKey(name = "FK_tipo_notificacion_notificacion"))
	private Notificacion notificacion;

	@Size(min = 5, message = "Glosa debe tener al menos 5 caracteres")
	@Column(name = "glosa", nullable = false, length = 50)
	private String glosa;

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public String getGlosa() {
		return glosa;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}
	
	

}
