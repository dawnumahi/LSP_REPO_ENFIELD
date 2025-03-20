package org.howard.edu.lsp.midterm.question2;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    public Book(){
    }

/**
 * Constructor with all parameters
 */
    public Book(String t, String a, String i, int y){
        this.title = t;
        this.author = a;
        this.ISBN = i;
        this.yearPublished = y;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getISBN(){
        return this.ISBN;
    }

    public int getYearPublished(){
        return this.yearPublished;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public void setAuthor(String a){
        this.author = a;
    }

    public void setISBN(String i){
        this.ISBN = i;
    }

    public void setYearPublished(int y){
        this.yearPublished = y;
    }
/**
 * Overrides the boolean equals(Object) method for the Book class
 * Two Books are equal only if they have the same authors and ISBN
 */
    public boolean equals(Book b){
        if ((this.ISBN == b.ISBN) && (this.author == b.author)){
            return true;
        }
        else{
            return false;
        }
    }

/**
 * Overrides the String toString() method for the Book class
 * The method now returns a specifically formatted description of the Book 
 */
    public String toString(){
        return ("Title: " + this.title + ", Author: " + this.author + 
        ", ISBN: " + this.ISBN + ", Year Published: " + this.yearPublished);
    }
}
