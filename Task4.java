/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Hernandez
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char choice;
        int heads = 0;
        int tails = 0;
        while (true) {
            System.out.print("1. Toss Coin\n2. Exit\nChoice: ");
            choice = console.next().charAt(0);
            if (choice == '2') {break;}
            if (flip()) {heads++;}
            else {tails++;}
            System.out.println("Heads: " + heads + ", Tails: " + tails);
        }
    }
    
    public static boolean flip() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
