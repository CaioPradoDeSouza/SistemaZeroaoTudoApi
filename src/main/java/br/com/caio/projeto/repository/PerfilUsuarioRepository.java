package br.com.caio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caio.projeto.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {

}
