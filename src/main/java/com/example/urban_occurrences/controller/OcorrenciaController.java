package com.example.urban_occurrences.controller;

import com.example.urban_occurrences.model.Ocorrencia;
import com.example.urban_occurrences.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Marca esta classe como um controlador REST
@RequestMapping("/ocorrencias")  // Mapeia as requisições para o endpoint /ocorrencias
public class OcorrenciaController {

    @Autowired  // Injeta automaticamente a instância de OcorrenciaService
    private OcorrenciaService service;

    // Método para criar uma nova ocorrência
    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);
    }

    // Método para buscar todas as ocorrências
    @GetMapping
    public List<Ocorrencia> findAll() {
        return service.findAll();
    }

    // Método para buscar uma ocorrência pelo ID
    @GetMapping("/{id}")
    public Ocorrencia findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Método para atualizar uma ocorrência existente
    @PutMapping("/{id}")
    public Ocorrencia update(@PathVariable Long id, @RequestBody Ocorrencia ocorrencia) {
        Ocorrencia existing = service.findById(id);
        if (existing != null) {
            ocorrencia.setId(id);  // Define o ID da ocorrência recebida para garantir a atualização correta
            return service.save(ocorrencia);
        } else {
            return null;  // Retorna nulo se a ocorrência não for encontrada
        }
    }

    // Método para deletar uma ocorrência pelo ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
