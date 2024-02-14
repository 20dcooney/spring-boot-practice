package com.pokemonreview.api.models;

public class Pokemon {
    private int id;
    private String name;
    private String type;

    //Constructors
    public Pokemon() {
    }

    public Pokemon(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
