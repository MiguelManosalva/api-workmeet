package hware.workmeet.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Usuario;
import hware.workmeet.repo.IParticipanteRepo;
import hware.workmeet.service.IParticipanteService;

@Service
public class ParticipanteServiceImpl implements IParticipanteService {

	@Autowired
	private IParticipanteRepo repo;

	@Override
	public Usuario registrar(Usuario obj) {
		return repo.save(obj);
	}

	@Override
	public Usuario modificar(Usuario obj) {
		return repo.save(obj);
	}

	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario leerPorId(Integer id) {
		Optional<Usuario> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Usuario();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
}
