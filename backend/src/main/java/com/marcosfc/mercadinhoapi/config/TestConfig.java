package com.marcosfc.mercadinhoapi.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcosfc.mercadinhoapi.entities.Cliente;
import com.marcosfc.mercadinhoapi.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null,"Mike",LocalDate.parse("21/08/1998",fm1));
		Cliente c2 = new Cliente(null,"Katarina",LocalDate.parse("14/02/2000",fm1));
		
		clienteRepository.saveAll(Arrays.asList(c1,c2));
		
	}
	
	
}
