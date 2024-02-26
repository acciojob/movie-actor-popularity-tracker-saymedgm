package com.driver;

public class Actor {
	private String name;
    private int popularity;

    public Actor(String name, int popularity) {
        this.name = name;
        this.popularity = popularity;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public int getPopularity() {
    	//your code goes here
        return popularity;
    }

    public void increasePopularity() {
    	//your code goes here
        popularity++;
    }

    @Override
    public String toString() {
    	//your code goes here
        return name + " (" + popularity + " points)";
    }

}
