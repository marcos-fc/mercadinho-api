package com.marcosfc.mercadinhoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.mercadinhoapi.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
