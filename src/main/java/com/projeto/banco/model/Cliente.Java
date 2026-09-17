package com.projeto.banco.model;
import Jakart.persitence.column;
import Jakart.persitence.Entity;
import Jakart.persistence.GeneratedValue;
import Jakart.persistence.GeneratedType;
import Jakart.persistence.id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(nome = "tb_clientes")
@Getter
@NoArgsConstructor
class cliente {
    @id
    @GeneratedValue(stratagy = GeneratedType.IDENTITY)
    private long id;
    @column(nullable = false)
    private String nome;
    @column(nullable = false, unique = true
    private String email;
    @column(nullable = false)
    private String senha;
    @column(nullable = false, unique = true
    private String documento;
    )
}