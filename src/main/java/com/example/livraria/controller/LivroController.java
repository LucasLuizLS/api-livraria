package com.example.livraria.controller;

import com.example.livraria.dto.LivroDTO;
import com.example.livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroDTO> listar() {
        return livroService.listar();
    }

    @GetMapping("/{id}")
    public Optional<LivroDTO> buscar(@PathVariable Long id) {
        return livroService.buscar(id);
    }

    @PostMapping
    public LivroDTO salvar(@RequestBody LivroDTO livroDTO) {
        return livroService.salvar(livroDTO);
    }

    @PutMapping("/{id}")
    public LivroDTO atualizar(@PathVariable Long id, @RequestBody LivroDTO livroDTO) {
        return livroService.atualizar(id, livroDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        livroService.deletar(id);
    }
}