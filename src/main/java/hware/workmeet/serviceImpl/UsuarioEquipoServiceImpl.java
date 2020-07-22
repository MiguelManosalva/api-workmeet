package hware.workmeet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hware.workmeet.model.UsuarioEquipo;
import hware.workmeet.repo.IUsuarioEquipoRepo;
import hware.workmeet.service.IUsuarioEquipoService;

public class UsuarioEquipoServiceImpl implements IUsuarioEquipoService {

	@Autowired
	private IUsuarioEquipoRepo repo;

	@Override
	public List<UsuarioEquipo> listarParticipantesEquipo(Integer idEquipo) {
		return repo.listarParticipantesEquipo(idEquipo);
	}
}
