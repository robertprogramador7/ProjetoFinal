package com.br.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.entity.Psicologo;
import com.br.repository.PsicologoRepository;

@Service
public class PsicologoService {

    private final PsicologoRepository repo;

    public PsicologoService(PsicologoRepository repo) {
        this.repo = repo;
    }

    public List<Psicologo> listar() {
        return repo.findAll();
    }

    public Psicologo buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Psicólogo não encontrado"));
    }

    public Psicologo salvar(Psicologo p) {
        return repo.save(p);
    }

    public Psicologo atualizar(Long id, Psicologo p) {
        Psicologo existente = buscar(id);
        existente.setNome(p.getNome());
        existente.setCrp(p.getCrp());
        existente.setEspecialidade(p.getEspecialidade());
        return repo.save(existente);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}