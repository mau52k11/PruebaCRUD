package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Codigobarra;
import com.example.demo.service.CodigobarraService;

@RestController
@RequestMapping ("/api/codigobarra/")
public class CodigobarraREST {
	
	//Crear enlaces con los servicios
	@Autowired
	private CodigobarraService codigobarraService;
	
	@PostMapping
	private ResponseEntity<Codigobarra> guardar (@RequestBody Codigobarra codigobarra){
		Codigobarra temporal = codigobarraService.create(codigobarra);
		
		try {
			return ResponseEntity.created(new URI("/api/codigobarra" + temporal.getIdcodigobarra())).body(temporal);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Codigobarra>> listarTodosLosCodigosbarras (){
		return ResponseEntity.ok(codigobarraService.getAllCategoria());
	
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCodigobarra(@RequestBody Codigobarra codigobarra){
		 codigobarraService.delete(codigobarra);
		 return ResponseEntity.ok().build(); 
	}
	
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Codigobarra>> listarCodigobarraPorId (@PathVariable ("id") Long id ){
		return ResponseEntity.ok(codigobarraService.findById(id));
	
	}   

}
