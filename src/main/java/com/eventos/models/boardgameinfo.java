package com.eventos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class boardgameinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String minPlayers;
	
	@NotBlank
	private String maxPlayers;
	
	@NotBlank
	private String anoLancamento;

	@NotBlank
	private String publicadora;

	@NotBlank
	private String img;

	@NotBlank
	private String categoria;

	public long getCodigo() {return codigo;	}

	public void setCodigo(long codigo) {this.codigo = codigo;	}

	public String getNome() {return nome;	}

	public void setNome(String nome) {this.nome = nome;	}

	public String getMinPlayers() { return minPlayers;}

	public void setMinPlayers(String minPlayers) {this.minPlayers = minPlayers;}

	public String getMaxPlayers() {return maxPlayers;}

	public void setMaxPlayers(String maxPlayers) {this.maxPlayers = maxPlayers;	}

	public String getAnoLancamento() {return anoLancamento;	}

	public void setAnoLancamento(String anoLancamento) {this.anoLancamento = anoLancamento;	}

	public String getPublicadora() {return publicadora;	}

	public void setPublicadora(String publicadora) {this.publicadora = publicadora;	}

	public String getImg() {return img;	}

	public void setImg(String img) {this.img = img;	}

	public String getCategoria() {return categoria;	}

	public void setCategoria(String categoria) {this.categoria = categoria;	}
}
