package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    boolean existsByDocumento(String nome, String senha, String email, String endereco, String contato);

}


