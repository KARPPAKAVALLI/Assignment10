package com.assignment10;

public class Flight {
    //3. Create Flight DTO class.
    //Create appropriate instance variables, static variables and methods with appropriate access modifiers.
    String flightNumber;
    String departureLocation;
    String destination;
    // Static variable to keep track of the total number of flights
    static int flightCount = 0;
    {
        flightCount++;
    }
    public void display(){
        System.out.println("Flight Number: "+this.flightNumber);
        System.out.println("Source: "+this.departureLocation);
        System.out.println("Destination: "+this.destination);
    }

}
