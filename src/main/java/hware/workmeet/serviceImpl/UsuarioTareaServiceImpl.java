package hware.workmeet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.UsuarioTarea;
import hware.workmeet.repo.IUsuarioTareaRepo;
import hware.workmeet.service.IUsuarioTareaService;

@Service
public class UsuarioTareaServiceImpl implements IUsuarioTareaService {

	@Autowired
	private IUsuarioTareaRepo repo;
	
	@Override
	public List<UsuarioTarea> listarParticipantesTarea(Integer idTarea) {
		return repo.listarParticipantesTarea(idTarea);
	}
}
