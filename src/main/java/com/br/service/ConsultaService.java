package com.br.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.entity.Consulta;
import com.br.exception.custom.RecursoNaoEncontrado;
import com.br.repository.ConsultaRepository;

@Service
public class ConsultaService {

    private final ConsultaRepository repo;

    public ConsultaService(ConsultaRepository repo) {
        this.repo = repo;
    }

    public List<Consulta> listar() {
        return repo.findAll();
    }

    public Consulta buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontrado("Consulta não encontrada"));
    }

    public Consulta salvar(Consulta c) {
        return repo.save(c);
    }

    public void deletar(Long id) {
        buscar(id); 
        repo.deleteById(id);
    }
}
