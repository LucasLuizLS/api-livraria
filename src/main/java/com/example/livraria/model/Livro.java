package com.example.livraria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Livro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long Id;
    private String titulo;
    private String autor;
    private int ano;
}