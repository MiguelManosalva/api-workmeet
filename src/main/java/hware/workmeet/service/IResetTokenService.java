package hware.workmeet.service;

import hware.workmeet.model.ResetToken;

public interface IResetTokenService {

	ResetToken findByToken(String token);

	void guardar(ResetToken token);

	void eliminar(ResetToken token);
}
