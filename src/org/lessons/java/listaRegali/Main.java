package org.lessons.java.listaRegali;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        File lista = new File("./listaRegali.txt");
        Scanner reader = new Scanner(lista);
        int counterList = 0;
        System.out.println("Ecco la tua lista regali:");
        while(reader.hasNextLine()){
            String riga = reader.nextLine();
            System.out.println(riga);
            counterList++;
        };
        System.out.println("Attualmente la lista regali contiene " + counterList + " regalo/o.");

        ArrayList<Regalo> listaRegali = new ArrayList<>();

        while(true){

            String choice = null;
            try {
                System.out.println("Vuoi inserire un regalo? y or n");
                choice = scanner.nextLine();


                if(choice.equals("n")){
                    System.out.println("esco");
                    break;
                }

                if(!choice.equals("y")){
                    throw new IllegalArgumentException("Dato inserito non valido");
                }
                System.out.println("Inserisci la descrizione del regalo.");
                String descrizione = scanner.nextLine();
                System.out.println("Inserisci il destinatario del regalo.");
                String destinatario = scanner.nextLine();

                Regalo regalo = new Regalo(descrizione, destinatario);


                listaRegali.add(regalo);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("La lista di regali adesso è questa: " + listaRegali);

        try(FileWriter writer = new FileWriter("./listaRegali.txt",true);) {

            for (Regalo regalo: listaRegali
                 ) {
                writer.write(regalo.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Il file non è accessibile.");
        }

        scanner.close();
    }
}
