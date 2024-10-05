package br.com.caio.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.caio.projeto.entity.PerfilEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PerfilDTO {
	
	private Long id;
	
	private String descricao;
	
	
	public PerfilDTO(PerfilEntity perfil) {
		BeanUtils.copyProperties(perfil, this);
	}
	
	
// Com lombok não é necessario essa secão	
//	public PerfilDTO() {
//		
//	};
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PerfilDTO other = (PerfilDTO) obj;
//		return Objects.equals(id, other.id);
//	}
//
//	
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
