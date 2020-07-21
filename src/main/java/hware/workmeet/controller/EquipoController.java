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
import hware.workmeet.model.Equipo;
import hware.workmeet.model.Reunion;
import hware.workmeet.service.IEquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

	@Autowired
	private IEquipoService service;
	
	@GetMapping
	public ResponseEntity<List<Equipo>> listar(){
		List<Equipo> lista = service.listar();
		return new ResponseEntity<List<Equipo>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Equipo> listarPorId(@PathVariable("id") Integer id){
		Equipo obj = service.leerPorId(id);
		if(obj.getIdEquipo() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Equipo>(obj, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Equipo> registrar(@Valid @RequestBody Equipo equipo){
		Equipo obj = service.registrar(equipo);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(equipo.getIdEquipo()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PutMapping
	public ResponseEntity<Equipo> modificar(@Valid @RequestBody Equipo equipo){
		Equipo obj = service.modificar(equipo);
		return new ResponseEntity<Equipo>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Equipo> eliminar(@PathVariable("id") Integer id){
		Equipo obj = service.leerPorId(id);
		if(obj.getIdEquipo() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} 
		service.eliminar(id);
		return new ResponseEntity<Equipo>(obj, HttpStatus.OK);
	}
	
}
