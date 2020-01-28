package HW6;

public class Main {
    public static void main(String[] args) {

        Books books = new Books(2);
        books.congestion(new Book(1, "The Grand Design", "Stephen Hawking", 2015, 406, 256, "Bantam"));
        Book book = new Book(2, "SuperHuman Encyclopedia", "Robert Winston", 2014, 256  , 250, "Random House");
        books.congestion(book);
        books.congestion(new Book(3, "Think of Number. Can You Feel the Force? What Makes Me Me?", "Johnny Ball", 2008, 777, 250, "Reader's Digest"));
        System.out.println("Enter percent to increase the price");
        books.PriceUp();
        books.viewAllUnits();
        System.out.println("Enter percent to decrease the price");
        books.PriceDown();
        books.viewAllUnits();
        System.out.println("Enter author's name: ");
        books.findOutAuthor().viewAllUnits();
        System.out.println("Enter year: ");
        books.findOutYear().viewAllUnits();


        Books books1 = new Books(2);
        System.out.println("Enter percent to increase the price");
        books1.PriceUp();
        books1.viewAllUnits();
        System.out.println("Enter percent to decrease the price");
        books1.PriceDown();
        books1.viewAllUnits();
        System.out.println("Enter author's name: ");
        books1.findOutAuthor().viewAllUnits();
        System.out.println("Enter year: ");
        books1.findOutYear().viewAllUnits();
    }
}
