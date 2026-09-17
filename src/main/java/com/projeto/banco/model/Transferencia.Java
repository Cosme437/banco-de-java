package com.projeto.banco.model;
import  Jakart.persistence.column;
import  Jakart.persistence.Entity;
import  Jakart.persistence.GeneratedValue;
import  Jakart.persistence.GeneratedType;
import  Jakart.persistence.id;
import  lombok.Getter;
import  lombok.NoArgsConstructor;

@Entity(nome = "tb_transferencia")
@Getter
@NoArgsConstructor
class conta {
    @id
    @GeneratedValue(stratagy = GeneratedType.IDENTITY)
    private long id;
    @column(nullable = false)
    private String valor;
    @column(nullable = false)
    private String origem;
    @column( nullable = false)
    private String data;
    @column(nullable = false)
    private String destinario;
    
    
}

