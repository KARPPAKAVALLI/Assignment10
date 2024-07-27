package com.assignment10;

import java.util.ArrayList;

public class Team {
    //5. Write two DTO classes to exhibit the has-a relationship given in the diagram.
    public String name;
    public String city;
    public String division;
    //a team has many players
    public ArrayList<Player> players;

    public void playGame(){
        System.out.println("The game is being played");
    }

    public void hireCoach(){
        System.out.println("A coach has been hired");
    }
    public void addPlayers(Player p){
        this.players.add(p);
    }
}
