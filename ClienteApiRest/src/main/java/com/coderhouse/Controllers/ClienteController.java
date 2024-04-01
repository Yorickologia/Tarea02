package com.coderhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.entidades.Cliente;
import com.coderhouse.repositorios.ClienteRepository;

@RestController
@RequestMapping("Cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository ClienteRepository;
	
	@GetMapping("/cliente/{id}")
	public Cliente obtenerCliente(@PathVariable Long id) {
        return ClienteRepository.obtenerCliente(id);
}
}
