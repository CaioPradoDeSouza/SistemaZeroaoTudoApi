package br.com.caio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caio.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
}