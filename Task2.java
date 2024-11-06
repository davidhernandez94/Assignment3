/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author David Hernandez
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = console.next();
        System.out.println("Please choose the case you want to convert: ");
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");
        char caseType = console.next().charAt(0);
        System.out.printf("\n%-40s: %s", "Original word", word);
        System.out.printf("\n%-40s: %s", "Calling the first convertCase method", convertCase(word));
        System.out.printf("\n%-40s: %s", "Calling the second convertCase method"
                + "", convertCase(word, caseType));
        
    }
    
    /**
     * 
     * @param word  String that is to be converted into title case
     * @return      new String with correct title case formatting
     */
    public static String toTitleCase(String word) {
        String text = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return text;
    }
    
    /**
     * 
     * @param word  String to be formatted into title case
     * @return      formatted String  
     */
    public static String convertCase(String word) {
        return toTitleCase(word);
    }
    
    public static String convertCase(String word, char caseType) {
        caseType = (char) (caseType < 97 ? caseType + 32 : caseType);
        return switch (caseType) {
            case 'u' -> word.toUpperCase();
            case 'l' -> word.toLowerCase();
            case 't' -> toTitleCase(word);
            default -> "";
        };
    }
}