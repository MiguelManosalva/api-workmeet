package hware.workmeet.service;

import java.util.List;

import hware.workmeet.model.UsuarioTarea;

public interface IUsuarioTareaService {
	List<UsuarioTarea> listarParticipantesTarea(Integer idTarea);

}
