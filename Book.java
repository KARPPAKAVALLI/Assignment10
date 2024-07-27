package com.assignment10;

public class Book {
    //1. Create Book DTO class with attributes like title, ISBN etc.
    // Create appropriate instance variables, static variables and methods with appropriate access modifiers.
    String title;
    String author;
    int isbn;
    static int bookCount=0;
    {
        bookCount++;
    }
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("ISBN: "+this.isbn);
    }
    public int totalBooks(){
        return bookCount;
    }
}
