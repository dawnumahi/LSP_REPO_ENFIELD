package org.howard.edu.lsp.midterm.question2;

public class Book {
    String title;
        String author;
        String ISBN;
        int yearPublished;

    public Book(){
    }

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

    public boolean equals(Book b){
        if ((this.ISBN == b.ISBN) && (this.author == b.author)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return ("Title: " + this.title + ", Author: " + this.author + 
        ", ISBN: " + this.ISBN + ", Year Published: " + this.yearPublished);
    }
}
