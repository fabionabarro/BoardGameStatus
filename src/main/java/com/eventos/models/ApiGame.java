package com.eventos.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("games")
public class ApiGame {

    private String name;
    @JsonProperty("year_published")
    private Integer yearPublished;
    @JsonProperty("min_players")
    private Integer minPlayers;
    @JsonProperty("max_players")
    private Integer maxPlayers;
    private String description;
//    @JsonProperty("primary_publisher")
//    private String primaryPublisher;

//    private ApiGameImages apiGameImages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Integer getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    public Integer getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

