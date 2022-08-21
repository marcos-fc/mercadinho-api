package com.marcosfc.mercadinhoapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcosfc.mercadinhoapi.entities.Compras;
import com.marcosfc.mercadinhoapi.services.ComprasService;

@RestController
@RequestMapping(value = "/compras")
public class ComprasResource {
	
	@Autowired
	private ComprasService service;
	
	@GetMapping
	public ResponseEntity<List<Compras>> findAll(){
		List<Compras> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Compras> findById(@PathVariable Long id){
		Compras obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
