package com.assignment10;

public class Player {
    //5. Write two DTO classes to exhibit the has-a relationship given in the diagram.
    public String name;
    public String position;
    public int jerseyNumber;

    public void playGame(){
        System.out.println("The game is being played");
    }

    public void train(){
        System.out.println("The player has started their training");
    }
}
