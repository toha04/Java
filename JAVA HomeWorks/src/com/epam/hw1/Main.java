package com.epam.hw1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("* * * *    * * * *         *         *           *\n"
                + "*          *     *       *   *       *  *     *  *\n"
                + "* *        * * * *      *     *      *     *     *\n"
                + "*          *           * * * * *     *           *\n"
                + "* * * *    *          *         *    *           *"
        );
        Scanner hello = new Scanner(System.in);
        String greeting = hello.nextLine();
        System.out.println("*     *" + "   " + "* * * *" + "   "  + "*      " + "   "  + "*      " + "   "  + "  * *  \n"
                          +"*     *" + "   " + "*      " + "   "  + "*      " + "   "  + "*      " + "   "  + " *   * \n"
                          +"* * * *" + "   "  + "* * *  " + "   "  + "*      " + "   "  + "*      " + "   "  + "*     *\n"
                          +"*     *" + "   "  + "*      " + "   "  + "*     *" + "   "  + "*     *" + "   "  + " *   * \n"
                          +"*     *" + "   "  + "* * * *" + "   "  + "* * * *" + "   "  + "* * * *" + "   "  + "  * *  "
        );

    }
}
