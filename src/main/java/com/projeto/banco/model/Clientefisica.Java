package com.projeto.banco.model;
import Jakart.persitence.column;
import Jakart.persitence.Entity;
import Jakart.persistence.GeneratedValue;
import Jakart.persistence.GeneratedType;
import Jakart.persistence.id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_clientefisica")
@Getter
@NoArgsConstructor
class cliente_fisica extends Cliente {
    @id
    @column(nullable = false)
    private String cpf;
    

    protected Cliente(String nome, String cpf, String email, String contato, String senha) {
        super(nome, senha, contato, email);
        this.documento = cpf;
    }
}
    

