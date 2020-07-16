package hware.workmeet.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Tarea;
import hware.workmeet.repo.ITareaRepo;
import hware.workmeet.service.ITareaService;

@Service
public class TareaServiceImpl implements ITareaService {
	
	@Autowired
	private ITareaRepo repo;

	@Override
	public Tarea registrar(Tarea obj) {
		return repo.save(obj);
	}

	@Override
	public Tarea modificar(Tarea obj) {
		return repo.save(obj);
	}

	@Override
	public List<Tarea> listar() {
		return repo.findAll();
	}

	@Override
	public Tarea leerPorId(Integer id) {
		Optional<Tarea> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Tarea();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	

}
