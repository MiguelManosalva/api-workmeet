package hware.workmeet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hware.workmeet.model.UsuarioReunion;
import hware.workmeet.service.IUsuarioReunionService;

@RestController
@RequestMapping("/usuario-reunion")
public class UsuarioReunionController {

	@Autowired
	private IUsuarioReunionService service;

	@GetMapping(value = "/{idReunion}")
	public ResponseEntity<List<UsuarioReunion>> listar(@PathVariable("idReunion") Integer idReunion) {
		List<UsuarioReunion> participantesReunion = new ArrayList<>();
		participantesReunion = service.listarParticipantesReunion(idReunion);
		return new ResponseEntity<List<UsuarioReunion>>(participantesReunion, HttpStatus.OK);
	}
}
