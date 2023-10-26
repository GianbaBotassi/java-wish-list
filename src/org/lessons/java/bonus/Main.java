package org.lessons.java.bonus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String word = scanner.nextLine().toLowerCase();

        HashMap<Character, Integer> hashMapWord = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if(hashMapWord.containsKey(word.charAt(i))){
                hashMapWord.put(word.charAt(i),hashMapWord.get(word.charAt(i)) + 1);
            }else{
            hashMapWord.put(word.charAt(i), 1);
            }
        }
        // Con iteratore
//        Iterator<Map.Entry<Character, Integer>> iterator = hashMapWord.entrySet().iterator();

//        while(iterator.hasNext()){
//            Map.Entry<Character,Integer> entry = iterator.next();
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        // Con enhanced for
        for(Map.Entry iterazione: hashMapWord.entrySet()){
            System.out.println(iterazione.getKey() + ":" + iterazione.getValue());
        }
    }
}
