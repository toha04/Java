package HW6;

public class Book {
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

    public void view() {
        System.out.println("Book-id: " + id +
                ", name: " + nameOfBook +
                ", author: " + author +
                ", publishing house: " + publishingHouse +
                ", year of publication: " + yearOfPublication +
                ", number of pages: " + numberOfPages +
                ", price: " + price);
    }

    public int getId() {
        return id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
