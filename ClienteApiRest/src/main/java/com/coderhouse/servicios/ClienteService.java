package com.coderhouse.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.Dto.ClienteDto;
import com.coderhouse.entidades.Cliente;
import com.coderhouse.repositorios.ClienteRepository;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente obtenerCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public ClienteDto obtenerClienteDto(Long id) {
        Cliente cliente = obtenerCliente(id);
        if (cliente != null) {
            int edad = calcularEdad(cliente.getFechaDeNacimiento());
            return new ClienteDto(cliente.getNombre(), cliente.getApellido(), edad);
        }
        return null;
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }
}
