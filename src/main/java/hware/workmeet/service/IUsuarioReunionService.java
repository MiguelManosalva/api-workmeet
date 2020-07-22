package hware.workmeet.service;

import java.util.List;

import hware.workmeet.model.UsuarioReunion;

public interface IUsuarioReunionService {
	List<UsuarioReunion> listarParticipantesReunion(Integer idReunion);

}
