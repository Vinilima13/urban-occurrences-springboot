package com.example.urban_occurrences.repository;

import com.example.urban_occurrences.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface de repositório que estende JpaRepository para fornecer métodos CRUD para a entidade Ocorrencia
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
