package com.marcosfc.mercadinhoapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcosfc.mercadinhoapi.entities.Compras;
import com.marcosfc.mercadinhoapi.repositories.ComprasRepository;

@Service
public class ComprasService {
	
	@Autowired
	private ComprasRepository repository;
	
	public List<Compras> findAll(){
		return repository.findAll();
	}
	
	public Compras findById(Long id) {
		Optional<Compras> obj = repository.findById(id);
		return obj.get();
	}
	
}
