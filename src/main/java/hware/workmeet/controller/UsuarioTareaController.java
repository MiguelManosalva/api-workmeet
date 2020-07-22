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

import hware.workmeet.model.UsuarioTarea;
import hware.workmeet.service.IUsuarioTareaService;

@RestController
@RequestMapping("/usuario-tarea")
public class UsuarioTareaController {

	@Autowired
	private IUsuarioTareaService service;

	@GetMapping(value = "/{idTarea}")
	public ResponseEntity<List<UsuarioTarea>> listar(@PathVariable("idTarea") Integer idTarea) {
		List<UsuarioTarea> participantesTarea= new ArrayList<>();
		participantesTarea = service.listarParticipantesTarea(idTarea);
		return new ResponseEntity<List<UsuarioTarea>>(participantesTarea, HttpStatus.OK);
	}
}
