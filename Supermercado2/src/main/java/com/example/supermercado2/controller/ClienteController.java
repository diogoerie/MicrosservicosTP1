package com.example.supermercado2.controller;

import com.example.supermercado2.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private Map<Long, Cliente> clientes = new HashMap<>();

    @GetMapping
    public Collection<Cliente> getAllClientes() {
        return clientes.values();
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        clientes.put(id, cliente);
        return cliente;
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clientes.remove(id);
    }
}
