package br.com.caio.projeto.entity;

import org.springframework.beans.BeanUtils;

import br.com.caio.projeto.dto.PerfilDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CPS_PERFIL")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
public class PerfilEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	public PerfilEntity(PerfilDTO perfil) {
		BeanUtils.copyProperties(perfil, this);
	}
	
	
// Com o lombok não é necessario toda essa seção	
//	public PerfilEntity() {
//		
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}

	
}
