package hware.workmeet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity 
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idUsuario;
	
	@Size(min=5, message = "Nombres debe tener al menos 5 caracteres")
	@Column(name = "nombres", nullable=false, length=50)
	private String nombres;
	
	@Size(min=5, message = "Apellidos debe tener al menos 5 caracteres")
	@Column(name = "apellidos", nullable=false, length=50)
	private String apellidos;
	
	@Size(min=5, message = "Nombre Usuario debe tener al menos 5 caracteres")
	@Column(name = "nombreUsuario", nullable=false, length=50)
	private String nombreUsuario;
	
	@Email
	@Column(name = "correo", nullable=false, length=50)
	private String correo;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
