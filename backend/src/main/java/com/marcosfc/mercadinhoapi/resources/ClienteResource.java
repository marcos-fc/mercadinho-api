package com.marcosfc.mercadinhoapi.resources;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcosfc.mercadinhoapi.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate dt  = LocalDate.parse("21/08/1998",fm1);
	
	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		Cliente c = new Cliente(1L,"Marcos", dt);
		System.out.println(c.getDataDeNascimento());
		return ResponseEntity.ok().body(c);
	}
}
