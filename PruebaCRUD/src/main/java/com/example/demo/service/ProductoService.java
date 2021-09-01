package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {
	
	//Para decirle que esta conectado con el Repositorio 
	@Autowired
	private ProductoRepository productoRepository;
	
	
	//Metodo para guardar
	public Producto create (Producto producto) {
		return productoRepository.save(producto);
	}
	
	//Listar todas las Categorias
	public List<Producto> getAllCategoria(){
		return productoRepository.findAll();
	}
	
	//Metodo para Eliminar
	public void delete (Producto producto) {
		productoRepository.delete(producto);
	}
	
	//Buscar por un id
	public Optional<Producto> findById (Long id){
		return productoRepository.findById(id);
	}


}
