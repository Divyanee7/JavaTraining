package com.yash.training;

class Author
{
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
class Book
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name,Author author,double price,int qtyInStock)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
   void display()
    {
        System.out.println("The Name of the book is: "+getName());
        System.out.println("The Author of the book is: "+getAuthor().getName());
        System.out.println("The Price of the book is: "+getPrice());
        System.out.println("The Stock of that book is: "+getQtyInStock());
    }

}


public class _19_3_Author {
    public static void main(String[] args) {
      Author a=new Author("James Clear","dd@gmail.com",'F');
      Book b=new Book("Atomic Habits", a,78.8,23 );
      b.display();

    }
}
