package hware.workmeet.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hware.workmeet.model.Usuario;
import hware.workmeet.repo.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements UserDetailsService {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = repo.findOneByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		
		UserDetails ud = new User(usuario.getUsername(), usuario.getPassword(), null);
		return ud;
	}
	

}
