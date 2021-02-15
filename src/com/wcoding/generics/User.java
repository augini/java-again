package com.wcoding.generics;

public class User implements Comparable<User> {
    private int points;
    private static int count;

    public User(int points){
        this.points = points;
        count++;
    }

    public static int printNameStatic(){
        return count;
    }

    public void printName(){
        System.out.println(this.points);
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
