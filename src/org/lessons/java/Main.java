package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Regalo> listaRegali = new ArrayList<>();

        while(true){
            System.out.println("Attualmente ci sono " + listaRegali.size() + " nella lista regali.");

            System.out.println("Vuoi inserire un regalo? y or n");
            String choice = scanner.nextLine();

            if(choice.equals("n")){
                System.out.println("esco");
                break;
            }

            System.out.println("Inserisci la descrizione del regalo.");
            String descrizione = scanner.nextLine();
            System.out.println("Inserisci il destinatario del regalo.");
            String destinatario = scanner.nextLine();

            Regalo regalo = new Regalo(descrizione, destinatario);

            listaRegali.add(regalo);

        }
        System.out.println("La lista di regali è questa: " + listaRegali);


//        try {
//            FileWriter writer = new FileWriter("./listaRegali.txt");
//
//        } catch (IOException e) {
//            System.out.println("Il file non è accessibile.");
//        }
    }
}
