package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hware.workmeet.model.UsuarioReunion;

public interface IUsuarioReunionRepo extends JpaRepository<UsuarioReunion, Integer> {

	@Modifying // Genera una transacción en BD
	@Query(value = "INSERT INTO usuario_reunion(id_usuario, id_reunion) VALUES (:idUsuario, :idReunion)", nativeQuery = true)
	Integer registrar(@Param("idUsuario") Integer idUsuario, @Param("idReunion") Integer idReunion);

}
