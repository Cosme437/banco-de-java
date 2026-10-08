package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_cliente_empresa")
@Getter
@NoArgsConstructor
class clienteempresa extends Cliente {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String cnpj;

    
    protected cliente_empresa(String nome, String cnpj, String endereco, String email, String contato) {
        super(nome, contato, endereco, contato, email);
        
       
    }
}
    


