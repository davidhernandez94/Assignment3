/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author David Hernandez
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number and a base, seperated by a space: ");
        int num = console.nextInt();
        int base = console.nextInt();
        System.out.println(isDivisible(num, base) ? 
                (num + " is divisible by " + base) :
                (num + " is not divisible by " + base));
        System.out.print((base == 3 ? "" : isDivisible(num) ? 
                (num + " is divisible by 3") :
                (num + " is not divisible by 3")) + "\n\n");
        System.out.print("Please enter an English letter: ");
        char letter = console.next().charAt(0);
        System.out.print("Please enter a number base and "
                + "an English letter base, seperated by a space: ");
        int base1 = console.nextInt();
        char charBase = console.next().charAt(0);
        System.out.print("\n\n'" + letter + "' is " 
                + (isDivisible(letter, base1) ? "" : "not ") + "divisible "
                + "by " + base1 );
        System.out.print("\n\n'" + letter + "' is " 
                + (isDivisible(letter, charBase) ? "" : "not ") + "divisible "
                + "by '" + charBase + "'\n");
    }
    
    public static int letterToNumber(char c) {
        return c < 97 ? c + - 65 : c - 97;
    }
    
    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }
    
    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }
    
    public static boolean isDivisible(char letter) {
        int num = letterToNumber(letter);
        return isDivisible(num);
    }
    
    public static boolean isDivisible(char letter, int base) {
        int num = letterToNumber(letter);
        return isDivisible(num, base);
    }
    
    public static boolean isDivisible(char letter, char base) {
        int numBase = letterToNumber(base);
        return isDivisible(letter, numBase);
    }
}