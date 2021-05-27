package com.eventos.entity;

import javax.persistence.*;

import com.eventos.models.BoardGameInfoDTO;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="boardgameinfo")
public class BoardGameInfo {

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
	private String descricao;
	@NotBlank
	private String publicadora;
	@NotBlank
	private String img;

	public String getDescricao() {return descricao;	}

	public void setDescricao(String descricao) {this.descricao = descricao;	}

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



	public BoardGameInfo() {

	}

	public BoardGameInfo(BoardGameInfoDTO boardGameInfoDTO) {
		this.codigo = boardGameInfoDTO.getCodigo();
		this.nome = boardGameInfoDTO.getNome();
		this.minPlayers = boardGameInfoDTO.getMinPlayers();
		this.maxPlayers = boardGameInfoDTO.getMaxPlayers();
		this.anoLancamento = boardGameInfoDTO.getAnoLancamento();
		this.descricao = boardGameInfoDTO.getDescricao();
		this.publicadora = boardGameInfoDTO.getPublicadora();
		this.img = boardGameInfoDTO.getImg();

	}

	@Override
	public String toString() {
		return "boardgameinfo{" +
				"codigo=" + codigo +
				", nome='" + nome + '\'' +
				", minPlayers='" + minPlayers + '\'' +
				", maxPlayers='" + maxPlayers + '\'' +
				", anoLancamento='" + anoLancamento + '\'' +
				", descricao='" + descricao + '\'' +
				", publicadora='" + publicadora + '\'' +
				", img='" + img + '\'' +

				'}';
	}
}
