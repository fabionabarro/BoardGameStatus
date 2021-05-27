package com.eventos.models;

import java.util.List;

public class BoardGameApiExternaDTO {
    List<ApiGame>games;

    public BoardGameApiExternaDTO() {
    }

    public BoardGameApiExternaDTO(List<ApiGame> games) {
        this.games = games;
    }

    public List<ApiGame> getGames() {
        return games;
    }

    public void setGames(List<ApiGame> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "BoardGameApiExternaDTO{" +
                "games=" + games +
                '}';
    }
}
