package org.lessons.java;

public class Snack5 {
    public static void main(String[] args) {
        String stringa = "22";
        int numeroInt = 0;

        for (int i = 0; i < stringa.length(); i++) {
            char carattere = stringa.charAt(i);

            int cifra = carattere - '0';
            numeroInt = numeroInt * 10 + cifra;
            System.out.println(numeroInt);
        }
    }
}
