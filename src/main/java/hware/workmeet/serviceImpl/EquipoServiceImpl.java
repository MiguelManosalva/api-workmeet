package hware.workmeet.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Equipo;
import hware.workmeet.repo.IEquipoRepo;
import hware.workmeet.service.IEquipoService;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	private IEquipoRepo repo;

	@Override
	public Equipo registrar(Equipo obj) {
		return repo.save(obj);
	}

	@Override
	public Equipo modificar(Equipo obj) {
		return repo.save(obj);
	}

	@Override
	public List<Equipo> listar() {
		return repo.findAll();
	}

	@Override
	public Equipo leerPorId(Integer id) {
		Optional<Equipo> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Equipo();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
