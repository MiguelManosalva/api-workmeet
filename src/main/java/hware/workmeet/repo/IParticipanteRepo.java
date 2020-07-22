package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.Usuario;

public interface IParticipanteRepo extends JpaRepository<Usuario, Integer>  {

}
