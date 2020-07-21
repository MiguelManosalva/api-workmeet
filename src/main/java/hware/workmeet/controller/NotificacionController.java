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
import hware.workmeet.model.Notificacion;
import hware.workmeet.service.INotificacionService;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
	
	@Autowired
	private INotificacionService service;
	
	@GetMapping
	public ResponseEntity<List<Notificacion>> listar(){
		List<Notificacion> lista = service.listar();
		return new ResponseEntity<List<Notificacion>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Notificacion> listarPorId(@PathVariable("id") Integer id){
		Notificacion obj = service.leerPorId(id);
		if(obj.getIdNotificacion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Notificacion>(obj, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Notificacion> registrar(@Valid @RequestBody Notificacion noti){
		Notificacion obj = service.registrar(noti);
		return new ResponseEntity<Notificacion>(obj, HttpStatus.OK);		
	}
	
	@PutMapping
	public ResponseEntity<Notificacion> modificar(@Valid @RequestBody Notificacion noti){
		Notificacion obj = service.modificar(noti);
		return new ResponseEntity<Notificacion>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Notificacion> eliminar(@PathVariable("id") Integer id){
		Notificacion obj = service.leerPorId(id);
		if(obj.getIdNotificacion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} 
		service.eliminar(id);
		return new ResponseEntity<Notificacion>(obj, HttpStatus.OK);
	}

}
