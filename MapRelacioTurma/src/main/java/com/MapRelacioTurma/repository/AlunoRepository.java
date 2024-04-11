package com.MapRelacioTurma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MapRelacioTurma.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {
	List<Aluno> findByCidade(String cidade);
	List<Aluno> findByNome(String nome);
	List<Aluno> findByRenda(double renda);
	List<Aluno> findByCidadeAndRenda(String cidade, double renda);
	List<Aluno> findByra(String ra);
}
