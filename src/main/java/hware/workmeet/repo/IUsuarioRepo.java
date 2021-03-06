package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.Usuario;

public interface IUsuarioRepo<T> extends JpaRepository<Usuario, Integer> {

	Usuario findOneByUsername(String username);
	
}
