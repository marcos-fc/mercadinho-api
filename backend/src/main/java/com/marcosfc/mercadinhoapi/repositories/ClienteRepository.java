package com.marcosfc.mercadinhoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.mercadinhoapi.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
