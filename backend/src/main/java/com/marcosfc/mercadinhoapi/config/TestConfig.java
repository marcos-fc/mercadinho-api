package com.marcosfc.mercadinhoapi.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcosfc.mercadinhoapi.entities.Cliente;
import com.marcosfc.mercadinhoapi.entities.Compras;
import com.marcosfc.mercadinhoapi.entities.Produto;
import com.marcosfc.mercadinhoapi.repositories.ClienteRepository;
import com.marcosfc.mercadinhoapi.repositories.ComprasRepository;
import com.marcosfc.mercadinhoapi.repositories.ProdutoRepository;

@Configuration
@Profile("dev") // após rodar o aplicativo uma vez, troque para 'test' pra evitar duplicação de
				// dados na base de dados
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ComprasRepository comprasRepository;

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Cliente cl1 = new Cliente(null, "Henrique", LocalDate.parse("19/05/1998", dtf));
		Cliente cl2 = new Cliente(null, "Katarina", LocalDate.parse("20/02/2000", dtf));
		Cliente cl3 = new Cliente(null, "Vanessa", LocalDate.parse("03/12/1994", dtf));
		Cliente cl4 = new Cliente(null, "Thiago", LocalDate.parse("11/07/1991", dtf));
		Cliente cl5 = new Cliente(null, "Jhony", LocalDate.parse("07/10/1994", dtf));

		clienteRepository.saveAll(Arrays.asList(cl1, cl2, cl3, cl4, cl5));

		Produto p1 = new Produto(null, "Cerveja importada", 12.10, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p2 = new Produto(null, "Cerveja nacional", 6.00, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p3 = new Produto(null, "Garrafa de vinho", 40.10, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p4 = new Produto(null, "Água", 3.20, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p5 = new Produto(null, "Alface", 3.49, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p6 = new Produto(null, "Cebolas", 4.99, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p7 = new Produto(null, "Batatas", 5.99, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p8 = new Produto(null, "Tomates", 8.39, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p9 = new Produto(null, "Laranjas", 4.60, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p10 = new Produto(null, "Bananas", 5.39, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p11 = new Produto(null, "Maçãs", 7.79, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p12 = new Produto(null, "Queijo fresco", 41.40, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p13 = new Produto(null, "Uma dúzia de ovos", 9.59, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p14 = new Produto(null, "Arroz", 5.99, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p15 = new Produto(null, "Um quilo de pão", 7.00, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p16 = new Produto(null, "Leite", 4.89, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p17 = new Produto(null, "Capuccino", 7.99, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p18 = new Produto(null, "Coca-Cola", 5.99, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p19 = new Produto(null, "Macarrão", 7.29, "Lorem ipsum dolor sit amet, consectetur.");
		Produto p20 = new Produto(null, "Feijão", 6.49, "Lorem ipsum dolor sit amet, consectetur.");

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
				p17, p18, p19, p20));

		Compras c1 = new Compras(null, cl1, p1, LocalDate.parse("14/10/2022", dtf));
		Compras c2 = new Compras(null, cl2, p2, LocalDate.parse("10/07/2022", dtf));
		Compras c3 = new Compras(null, cl2, p3, LocalDate.parse("11/10/2022", dtf));
		Compras c4 = new Compras(null, cl1, p4, LocalDate.parse("18/10/2022", dtf));
		Compras c5 = new Compras(null, cl3, p5, LocalDate.parse("13/08/2022", dtf));
		Compras c6 = new Compras(null, cl2, p6, LocalDate.parse("12/08/2022", dtf));
		Compras c7 = new Compras(null, cl4, p7, LocalDate.parse("08/10/2022", dtf));
		Compras c8 = new Compras(null, cl5, p8, LocalDate.parse("09/11/2022", dtf));
		Compras c9 = new Compras(null, cl3, p9, LocalDate.parse("02/01/2022", dtf));
		Compras c10 = new Compras(null, cl4, p10, LocalDate.parse("25/11/2022", dtf));
		Compras c11 = new Compras(null, cl5, p11, LocalDate.parse("22/01/2022", dtf));
		Compras c12 = new Compras(null, cl5, p12, LocalDate.parse("17/05/2022", dtf));
		Compras c13 = new Compras(null, cl2, p13, LocalDate.parse("27/10/2022", dtf));
		Compras c14 = new Compras(null, cl2, p14, LocalDate.parse("02/03/2022", dtf));
		Compras c15 = new Compras(null, cl1, p15, LocalDate.parse("05/05/2022", dtf));
		Compras c16 = new Compras(null, cl3, p16, LocalDate.parse("03/05/2022", dtf));
		Compras c17 = new Compras(null, cl2, p17, LocalDate.parse("19/02/2022", dtf));
		Compras c18 = new Compras(null, cl5, p18, LocalDate.parse("11/03/2022", dtf));
		Compras c19 = new Compras(null, cl4, p19, LocalDate.parse("24/04/2022", dtf));
		Compras c20 = new Compras(null, cl1, p20, LocalDate.parse("25/07/2022", dtf));

		comprasRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
				c17, c18, c19, c20));
	}

}
