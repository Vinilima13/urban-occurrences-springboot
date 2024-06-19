package com.example.urban_occurrences.service;

import com.example.urban_occurrences.model.Ocorrencia;
import com.example.urban_occurrences.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Marca esta classe como um serviço do Spring
public class OcorrenciaService {

    @Autowired  // Injeta automaticamente a instância de OcorrenciaRepository
    private OcorrenciaRepository repository;

    // Método para salvar uma ocorrência
    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    // Método para buscar todas as ocorrências
    public List<Ocorrencia> findAll() {
        return repository.findAll();
    }

    // Método para buscar uma ocorrência pelo ID
    public Ocorrencia findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Método para deletar uma ocorrência pelo ID
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
