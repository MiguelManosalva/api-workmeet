package hware.workmeet.controller;

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

import hware.workmeet.exception.ModeloNotFoundException;
import hware.workmeet.model.Tarea;
import hware.workmeet.service.ITareaService;

@RestController
@RequestMapping("/tarea")
public class TareaController {

	@Autowired
	private ITareaService service;
	
	@GetMapping
	public ResponseEntity<List<Tarea>> listar(){
		List<Tarea> lista = service.listar();
		return new ResponseEntity<List<Tarea>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarea> listarPorId(@PathVariable("id") Integer id){
		Tarea obj = service.leerPorId(id);
		if(obj.getIdTarea() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Tarea> registrar(@Valid @RequestBody Tarea tarea){
		Tarea obj = service.registrar(tarea);
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);		
	}
	
	@PutMapping
	public ResponseEntity<Tarea> modificar(@Valid @RequestBody Tarea tarea){
		Tarea obj = service.modificar(tarea);
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Tarea> eliminar(@PathVariable("id") Integer id){
		Tarea obj = service.leerPorId(id);
		if(obj.getIdTarea() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} 
		service.eliminar(id);
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
	}

}
