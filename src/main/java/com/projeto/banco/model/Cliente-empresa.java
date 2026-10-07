package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_cartao")
@Getter
@NoArgsConstructor
class cliente_empresa {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String endereco;
    @Column( nullable = false)
    private String email;
    @Column(nullable = false)
    private String contato;
       
}

