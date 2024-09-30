package br.com.caio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caio.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
