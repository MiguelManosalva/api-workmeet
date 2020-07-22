package hware.workmeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hware.workmeet.model.UsuarioTarea;

public interface IUsuarioTareaRepo extends JpaRepository<UsuarioTarea, Integer> {

	@Modifying // Genera una transacción en BD
	@Query(value = "INSERT INTO usuario_tarea(id_usuario, id_tarea) VALUES (:idUsuario, :idTarea)", nativeQuery=true)
	Integer registrar(@Param("idUsuario") Integer idUsuario, @Param("idTarea") Integer idTarea);

	@Query("from UsuarioTarea ce where ce.tarea.idTarea = :idTarea")
	List<UsuarioTarea> listarParticipantesTarea(@Param("idTarea") Integer idTarea);
}
