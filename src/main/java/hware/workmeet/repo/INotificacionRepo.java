package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.Notificacion;

public interface INotificacionRepo extends JpaRepository<Notificacion, Integer> {

}
