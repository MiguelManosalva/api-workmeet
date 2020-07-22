package hware.workmeet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.UsuarioReunion;
import hware.workmeet.repo.IUsuarioReunionRepo;
import hware.workmeet.service.IUsuarioReunionService;

@Service
public class UsuarioReunionServiceImpl implements IUsuarioReunionService {

	@Autowired
	private IUsuarioReunionRepo repo;
	
	@Override
	public List<UsuarioReunion> listarParticipantesReunion(Integer idReunion) {
		return repo.listarParticipantesReunion(idReunion);
	}

}
