package com.marcosfc.mercadinhoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.mercadinhoapi.entities.Compras;

public interface ComprasRepository extends JpaRepository <Compras, Long> {

}
