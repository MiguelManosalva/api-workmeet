package hware.workmeet.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import hware.workmeet.exception.ModeloNotFoundException;
import hware.workmeet.model.Reunion;
import hware.workmeet.service.IReunionService;

@RestController
@RequestMapping("/reunion")
public class ReunionController {

	@Autowired
	private IReunionService service;
	
	@GetMapping
	public ResponseEntity<List<Reunion>> listar(){
		List<Reunion> lista = service.listar();
		return new ResponseEntity<List<Reunion>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Reunion> listarPorId(@PathVariable("id") Integer id){
		Reunion reu = service.leerPorId(id);
		if(reu.getIdReunion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Reunion>(reu, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Reunion> registrar(@Valid @RequestBody Reunion reunion){
		Reunion reu = service.registrar(reunion);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(reunion.getIdReunion()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PutMapping
	public ResponseEntity<Reunion> modificar(@Valid @RequestBody Reunion reunion){
		Reunion reu = service.modificar(reunion);
		return new ResponseEntity<Reunion>(reu, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Reunion> eliminar(@PathVariable("id") Integer id){
		Reunion reu = service.leerPorId(id);
		if(reu.getIdReunion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} 
		service.eliminar(id);
		return new ResponseEntity<Reunion>(reu, HttpStatus.OK);
	}
	
}
