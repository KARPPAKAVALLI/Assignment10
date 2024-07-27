package com.assignment10;

public class Movie {
    //4. Create a Movie DTO class
    String title;
    String genre;
    String actress;
    String actor;
    float budget;
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Genre: "+this.genre);
        System.out.println("Actress: "+this.actress);
        System.out.println("Actor: "+this.actor);
        System.out.println("Budget: "+this.budget);
    }
}
