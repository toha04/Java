package com.epam.hw8;

        import java.io.Serializable;

public class Book implements  Cloneable{
    private int id;
    private String nameOfBook;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;



    public Book(int id, String nameOfBook,
                String author,
                int yearOfPublication,
                int numberOfPages,
                double price,
                String publishingHouse ){
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }
    @Override
    public String toString() {
        String result = "Book1 - " +
                "id = " + id +
                ", nameOfBook - '" + nameOfBook + '\'' +
                ", author - '" + author + '\'' +
                ", publishingHouse - '" + publishingHouse + '\'' +
                ", yearOfPublication - " + yearOfPublication +
                ", numberOfPages - " + numberOfPages +
                ", price - " + price +
                '}' ;
        return result;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public Object clone () throws CloneNotSupportedException {
        Book bookClone = (Book)super.clone();
        return bookClone;
    }

}
