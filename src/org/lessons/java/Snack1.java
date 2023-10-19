package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("inserisci un numero");
            num = Integer.parseInt(scan.nextLine());

            if (num<0){
                System.out.println("il numero è negativo" + " " + num);
                break;
            }

            if (num % 2 == 0){
                System.out.println(num);
            } else if (num % 2 == 1) {
                System.out.println(num+1);
            }

        }
        System.out.println("esco dal ciclo");
        scan.close();
    }
}
