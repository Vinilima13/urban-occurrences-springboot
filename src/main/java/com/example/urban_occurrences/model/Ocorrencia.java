package com.example.urban_occurrences.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity  // Indica que essa classe é uma entidade JPA
@Data  // Gera automaticamente getters, setters e outros métodos úteis usando Lombok
public class Ocorrencia {
    @Id  // Marca o campo id como a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Configura a geração automática do valor do id
    private Long id;
    private String tipo;
    private String descricao;
    private String localizacao;
    private String status;
}
