package hware.workmeet.service;

import java.util.List;

import hware.workmeet.model.UsuarioEquipo;

public interface IUsuarioEquipoService {
	List<UsuarioEquipo> listarParticipantesEquipo(Integer idEquipo);

}
