package com.br.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.entity.Paciente;
import com.br.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repo;

    public PacienteService(PacienteRepository repo) {
        this.repo = repo;
    }

    public List<Paciente> listar() {
        return repo.findAll();
    }

    public Paciente buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public Paciente salvar(Paciente p) {
        return repo.save(p);
    }

    public Paciente atualizar(Long id, Paciente p) {
        Paciente existente = buscar(id);
        existente.setNome(p.getNome());
        existente.setEmail(p.getEmail());
        existente.setTelefone(p.getTelefone());
        return repo.save(existente);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}