package hware.workmeet.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Reunion;
import hware.workmeet.repo.IReunionRepo;
import hware.workmeet.service.IReunionService;

@Service
public class ReunionServiceImpl implements IReunionService {

	@Autowired
	private IReunionRepo repo;
	
	@Override
	public Reunion registrar(Reunion obj) {
		return repo.save(obj);
	}

	@Override
	public Reunion modificar(Reunion obj) {
		return repo.save(obj);
	}

	@Override
	public List<Reunion> listar() {
		return repo.findAll();
	}

	@Override
	public Reunion leerPorId(Integer id) {
		Optional<Reunion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Reunion();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	
}
