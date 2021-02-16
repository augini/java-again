package com.wcoding.streams;

public class Movie {
    private String name;
    private int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public int getLikes() {
        return likes;
    }
}
