package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.entity.Psicologo;

public interface PsicologoRepository extends JpaRepository<Psicologo, Long> {
	
    }