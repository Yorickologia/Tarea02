package com.coderhouse.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.entidades.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
	Cliente obtenerCliente(Long id);
}
