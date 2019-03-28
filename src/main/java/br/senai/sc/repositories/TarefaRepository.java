package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
