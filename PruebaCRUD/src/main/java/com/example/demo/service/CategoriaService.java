package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	//Metodo para guardar
	public Categoria create (Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	//Listar todas las Categorias
	public List<Categoria> getAllCategoria(){
		return categoriaRepository.findAll();
	}
	
	//Metodo para Eliminar
	public void delete (Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
	
	//Buscar por un id
	public Optional<Categoria> findById (Long id){
		return categoriaRepository.findById(id);
	}
	
	
	
	
	
}
