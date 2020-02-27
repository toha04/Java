package com.epam.hw8;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Menu implements Cloneable{
    Books books;
    public Books getCloneOfABook() throws CloneNotSupportedException {
        Books clone = (Books)clone();
        return clone;
    }
    public void menu() {

    }
    public void menuMain() throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu list: ");

        System.out.println("1. View all books: ");
        System.out.println("2. Sort by authors: ");
        System.out.println("3. Sort by publishers: ");
        System.out.println("4. Sort by price: ");
        System.out.println("5. Search by authors.");
        int select = 0;
        try  {
            select = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter necessary sorting figure! ");
            menuMain();
        }

        switch (select) {
            case 1:
            try {
                books.viewAllElements();
            } catch (EmptyArrayException e) {
                System.out.println(e.getMessage());
            }
            break;
            case 2:
                try {
                    getCloneOfABook().getAuthorsNameCompared();
                    getCloneOfABook().viewAllElements();
                } catch (EmptyArrayException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3 :
                try {
                    getCloneOfABook().getPublishersNameCompared();
                    getCloneOfABook().viewAllElements();
                } catch (EmptyArrayException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                try {
                    getCloneOfABook().getPriceCompared();
                    getCloneOfABook().viewAllElements();
                } catch(EmptyArrayException e) {
                    System.out.println(e.getMessage());
            }
            case 5:
                try {
                    System.out.println("Enter author's name.");
                    sc.nextLine();
                    books.findOutAuthor(sc.nextLine()).viewAllElements();
                } catch (EmptyArrayException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        menuMain();
    }

}
