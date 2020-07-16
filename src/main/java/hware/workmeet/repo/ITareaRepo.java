package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.Tarea;

public interface ITareaRepo extends JpaRepository<Tarea, Integer> {

}
