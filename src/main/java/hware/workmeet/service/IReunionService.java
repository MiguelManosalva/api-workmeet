package hware.workmeet.service;

import hware.workmeet.dto.UsuariosReunionDTO;
import hware.workmeet.model.Reunion;

public interface IReunionService extends ICRUD<Reunion>{

	Reunion registrarUsuariosReunion(UsuariosReunionDTO dto);
}
