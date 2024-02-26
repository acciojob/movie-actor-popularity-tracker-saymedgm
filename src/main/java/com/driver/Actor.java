package com.driver;

public class Actor {
    private String name;
    private int popularity;

    public Actor(String name, int popularity) {
        this.name = name;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public void increasePopularity() {
        popularity++;
    }

    @Override
    public String toString() {
        return name + " (" + popularity + " points)";
    }

}