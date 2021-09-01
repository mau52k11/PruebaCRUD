package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Codigobarra;
import com.example.demo.repository.CodigobarraRepository;

@Service
public class CodigobarraService {
	
	//Para decirle que esta conectado con el Repositorio 
	@Autowired
	private CodigobarraRepository codigobarraRepository;
	
	
	//Metodo para guardar
	public Codigobarra create (Codigobarra codigobarra) {
		return codigobarraRepository.save(codigobarra);
	}
	
	//Listar todas las Categorias
	public List<Codigobarra> getAllCategoria(){
		return codigobarraRepository.findAll();
	}
	
	//Metodo para Eliminar
	public void delete (Codigobarra codigobarra) {
		codigobarraRepository.delete(codigobarra);
	}
	
	//Buscar por un id
	public Optional<Codigobarra> findById (Long id){
		return codigobarraRepository.findById(id);
	}


	

}
