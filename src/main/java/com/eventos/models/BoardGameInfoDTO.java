package com.eventos.models;

import com.eventos.entity.BoardGameInfo;

public class BoardGameInfoDTO {

    private long codigo;
    private String nome;
    private String minPlayers;
    private String maxPlayers;
    private String anoLancamento;
    private String descricao;
    private String publicadora;
    private String img;


    public BoardGameInfoDTO() {

    }

    public BoardGameInfoDTO(BoardGameInfo boardGameInfo) {
        this.codigo = boardGameInfo.getCodigo();
        this.nome = boardGameInfo.getNome();
        this.minPlayers = boardGameInfo.getMinPlayers();
        this.maxPlayers = boardGameInfo.getMaxPlayers();
        this.anoLancamento = boardGameInfo.getAnoLancamento();
        this.descricao = boardGameInfo.getDescricao();
        this.publicadora = boardGameInfo.getPublicadora();
        this.img = boardGameInfo.getImg();

    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(String minPlayers) {
        this.minPlayers = minPlayers;
    }

    public String getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(String maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    @Override
    public String toString() {
        return "BoardGameInfoDTO{" +
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
