package com.projeto.banco.model;
import Jakart.persitence.column;
import Jakart.persitence.Entity;
import Jakart.persistence.GeneratedValue;
import Jakart.persistence.GeneratedType;
import Jakart.persistence.id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_cliente")
@Getter
@NoArgsConstructor
class cliente {
    @id
    @GeneratedValue(stratagy = GeneratedType.IDENTITY)
    private long id;
    @column(nullable = false)
    private String nome;
    @column(nullable = false, unique = true)
    private String email;
    @column(nullable = false)
    private String senha;
    @column(nullable = false, unique = true)
    private String contato;
    @column(nullable = false)
    private String cpf;
    

    protected Cliente(String nome, String cpf, String email, String contato, String senha) {
        this.nome = nome;
        this.documento = cpf;
        this.email = email;
        this.contato = contato;
        this.senha = senha;
    }

    public abstract String setnome(return){
        this.nome = nome;
    };

    public abstract String getNome(){
        this.nome = nome;
    };
}
