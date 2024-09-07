package com.example.supermercado2.controller;


import com.example.supermercado2.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private Map<Long, Produto> produtos = new HashMap<>();

    @GetMapping
    public Collection<Produto> getAllProdutos() {
        return produtos.values();
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) {
        return produtos.get(id);
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produtos.put(id, produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtos.remove(id);
    }
}
