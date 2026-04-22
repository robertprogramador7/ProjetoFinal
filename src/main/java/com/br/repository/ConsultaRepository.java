package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
	
	}