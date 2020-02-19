package com.epam.hw4;

public class Task1 {
    public static void main(String[] args) {
     String str = "abdaaaassjss";

        System.out.println(uniqueSymbols(str));



    }
    public static String uniqueSymbols(String str) {
        char ch = 'a';
        String result = "";
        str = str.toLowerCase();
        for(int i = 0; i < 26; i++) {

            if (str.indexOf(ch) != -1) {

                if (str.indexOf(ch, str.indexOf(ch) + 1) == -1) {
                    result += ch;
                }
            }
            ch += 1;
        }

        return result;
    }
}
