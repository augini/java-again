package com.wcoding.generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points){
        this.points = points;
    }

    @Override
    public String toString() {
        return "User{" +
                "points=" + points +
                '}';
    }

    @Override
    public int compareTo(User other) {
       return points - other.points;
    }
}
