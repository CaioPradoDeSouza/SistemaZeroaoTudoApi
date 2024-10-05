package br.com.caio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caio.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
