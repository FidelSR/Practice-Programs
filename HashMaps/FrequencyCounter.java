package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

//This program counts how many times each letter appears in a string
public class FrequencyCounter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a String: ");
        String input = scanner.nextLine();
        System.out.println(input + " has these many repeated letters: ");
        countLetters(input);
        scanner.close();
    }

    public static void countLetters(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c :s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
            //Get the current count for this character, 0 if not found, adds 1 and stores it back in the map
        }
        System.out.println(freq);
    }
}