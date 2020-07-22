package hware.workmeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hware.workmeet.model.UsuarioEquipo;

public interface IUsuarioEquipoRepo extends JpaRepository<UsuarioEquipo, Integer> {

	@Modifying
	@Query(value = "INSERT INTO usuario_Equipo(id_usuario, id_equipo) VALUES (:idUsuario, :idEquipo)", nativeQuery=true)
	Integer registrar(@Param("idUsuario") Integer idUsuario, @Param("idEquipo") Integer idEquipo);

	@Query("from UsuarioEquipo ce where ce.equipo.idEquipo = :idEquipo")
	List<UsuarioEquipo> listarParticipantesEquipo(@Param("idEquipo") Integer idEquipo);

}
