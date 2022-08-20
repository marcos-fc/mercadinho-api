package com.marcosfc.mercadinhoapi.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcosfc.mercadinhoapi.entities.Cliente;
import com.marcosfc.mercadinhoapi.entities.Produto;
import com.marcosfc.mercadinhoapi.repositories.ClienteRepository;
import com.marcosfc.mercadinhoapi.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null,"Mike",LocalDate.parse("21/08/1998",fm1));
		Cliente c2 = new Cliente(null,"Katarina",LocalDate.parse("14/02/2000",fm1));
		
		clienteRepository.saveAll(Arrays.asList(c1,c2));
		
		Produto p1 = new Produto(null, "The Lord of the Rings", 90.5,"Lorem ipsum dolor sit amet, consectetur.");
		Produto p2 = new Produto(null, "Smart TV", 2190.0,"Lorem ipsum dolor sit amet, consectetur.");
		Produto p3 = new Produto(null, "Macbook Pro", 1250.0,"Lorem ipsum dolor sit amet, consectetur.");
		Produto p4 = new Produto(null, "PC Gamer", 1200.0,"Lorem ipsum dolor sit amet, consectetur.");
		Produto p5 = new Produto(null, "Rails for Dummies", 100.99,"Lorem ipsum dolor sit amet, consectetur.");
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
	}
	
	
}
