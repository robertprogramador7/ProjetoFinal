package com.br.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.entity.Psicologo;
import com.br.service.PsicologoService;

@RestController
@RequestMapping("/psicologos")
public class PsicologoController {

    private final PsicologoService service;

    public PsicologoController(PsicologoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Psicologo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Psicologo buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Psicologo salvar(@RequestBody Psicologo p) {
        return service.salvar(p);
    }

    @PutMapping("/{id}")
    public Psicologo atualizar(@PathVariable Long id, @RequestBody Psicologo p) {
        return service.atualizar(id, p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}