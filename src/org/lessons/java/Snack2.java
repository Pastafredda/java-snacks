package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi ={"Marco","Sara", "Lorenzo","Tiziana", "Pietro", "Francesco", "David", "Leo", "Chiara"};
        String[] cognomi ={"Rossi", "Esposito", "Bianchi", "Scorsese", "Di Caprio", "Fincher","Foster", "Snyder"};
        Random randomGenerator = new Random();

        for (int i = 0; i <10; i++) {
            String nomeCasuale = nomi[randomGenerator.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[randomGenerator.nextInt(cognomi.length)];

            String nomeCompeto = nomeCasuale + " " +cognomeCasuale;

            System.out.println(nomeCompeto);
        }


    }
}
