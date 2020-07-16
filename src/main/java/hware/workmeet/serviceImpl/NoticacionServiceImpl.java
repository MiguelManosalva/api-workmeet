package hware.workmeet.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Notificacion;
import hware.workmeet.repo.INotificacionRepo;
import hware.workmeet.service.INotificacionService;

@Service
public class NoticacionServiceImpl implements INotificacionService {

	@Autowired
	private INotificacionRepo repo;

	@Override
	public Notificacion registrar(Notificacion obj) {
		return repo.save(obj);
	}
	
	@Override
	public Notificacion modificar(Notificacion obj) {
		return repo.save(obj);
	}

	@Override
	public List<Notificacion> listar() {
		return repo.findAll();
	}

	@Override
	public Notificacion leerPorId(Integer id) {
		Optional<Notificacion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Notificacion();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
