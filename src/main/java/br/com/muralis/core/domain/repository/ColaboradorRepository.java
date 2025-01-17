package br.com.muralis.core.domain.repository;

import br.com.muralis.core.domain.entity.Colaborador;

import java.util.List;
import java.util.Optional;

public interface ColaboradorRepository {
    
    Colaborador save(Colaborador colaborador);

    Optional<Colaborador> findById(String id);

    boolean existsByEmail(String email);

    boolean deleteById(String id);

    List<Colaborador> findAll(int page, int size);

    long count();

    Colaborador update(Colaborador colaboradorParaAtualizar);

}
