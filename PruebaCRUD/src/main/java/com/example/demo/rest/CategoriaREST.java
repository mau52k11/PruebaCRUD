package com.example.demo.rest;

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

import com.example.demo.model.Categoria;
import com.example.demo.service.CategoriaService;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/categoria/")
public class CategoriaREST {

	//Crear enlaces con los servicios
	@Autowired
	private CategoriaService categoriaService;
	
	@PostMapping
	private ResponseEntity<Categoria> guardar (@RequestBody Categoria categoria){
		Categoria temporal = categoriaService.create(categoria);
		
		try {
			return ResponseEntity.created(new URI("/api/categoria" + temporal.getId())).body(temporal);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Categoria>> listarTodasLasCategoria (){
		return ResponseEntity.ok(categoriaService.getAllCategoria());
	
	}
	
	@DeleteMapping 
	private ResponseEntity<Void> eliminarCategoria(@RequestBody Categoria categoria){
		 categoriaService.delete(categoria);
		 return ResponseEntity.ok().build(); 
	}
	
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Categoria>> listarCategoriaPorId (@PathVariable ("id") Long id ){
		return ResponseEntity.ok(categoriaService.findById(id));
	
	}   
	
	
}
