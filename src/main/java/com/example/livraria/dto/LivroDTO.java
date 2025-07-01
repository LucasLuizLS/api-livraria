package com.example.livraria.dto;

import lombok.Data;

@Data
public class LivroDTO {
    private Long Id;
    private String titulo;
    private String autor;
    private int ano;
}