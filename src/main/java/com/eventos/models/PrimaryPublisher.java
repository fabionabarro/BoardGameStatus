package com.eventos.models;

public class PrimaryPublisher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrimaryPublisher{" +
                "name='" + name + '\'' +
                '}';
    }
}
