package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.banco.model.Estoque;

public interface EstoqueRepository
        extends JpaRepository<Estoque, Long> {
}