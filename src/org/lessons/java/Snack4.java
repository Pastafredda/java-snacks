package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("inserisci una parola verifico se è palindroma");
        String word = scan.nextLine();
        System.out.println(word);
        char[] chars= word.toCharArray();
        boolean palindroma = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 -i]){
                palindroma = false;
                System.out.println("la parola non è palindroma");
                break;
            }
        }
        if(palindroma){
            System.out.println("La parola è palindroma");
        }

        scan.close();
    }
}
