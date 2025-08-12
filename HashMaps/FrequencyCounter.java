package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

//This program counts how many times each letter appears in a string
public class FrequencyCounter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to count the frequency of letters or words?");
        String input = scanner.nextLine();
        //Input validation
        try{
            input = input.toLowerCase();
            if (input.equals("letters")){
                System.out.println("Type a word: ");
                input = scanner.nextLine();
                System.out.println(input + " has these many repeated letters: ");
                countLetters(input);
            } else if(input.equals("words")) {
                System.out.println("Type a sentence: ");
                input = scanner.nextLine();
                System.out.println("The sentence \"" + input + "\" has these many repeated words: ");
                countWords(input);
            }else{
                System.err.println("Error: Please type either 'letters' or 'words'");
            }
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    public static void countLetters(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c :s.toCharArray()){
            if(c == ' ') continue;
            freq.put(c, freq.getOrDefault(c,0)+1);
            //Get the current count for this character, 0 if not found, adds 1 and stores it back in the map
        }
        System.out.println(freq);
    }

    public static void countWords(String s){
        HashMap<String, Integer> freq = new HashMap<>();
        String regex = "[,\\.\\s!?]";
        String[] words = s.split(regex);
        for(String str : words){
            if(str.isEmpty()) continue; //skips empty strings so they don't get added to the map
            str = str.toLowerCase(); //makes the word lower case
            freq.put(str, freq.getOrDefault(str,0)+1);
        }
        System.out.println(freq);
    }
}