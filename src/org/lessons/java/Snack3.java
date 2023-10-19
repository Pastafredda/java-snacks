package org.lessons.java;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        //crea un array di numeri interi
        int[] numeri ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numeri));
        int somma= 0;
        // somma tutti quelli in postazione dispari
        for (int i = 0; i < numeri.length; i++) {
            if (i % 2 != 0){
                somma += numeri[i];
            }
        }
        System.out.println(somma);
    }
}
