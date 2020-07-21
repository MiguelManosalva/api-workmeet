package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.ResetToken;


public interface IResetTokenRepo extends JpaRepository<ResetToken, Integer> {
	
	ResetToken findByToken(String token);

}
