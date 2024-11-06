/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author David Hernandez
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter two numbers, seperated by space: ");
        double num1 = console.nextDouble();
        double num2 = console.nextDouble();
        System.out.print("Please enter the operator (+, -, *, /): ");
        char oper = console.next().charAt(0);
        console.nextLine();
        System.out.print("Please enter a formular, e.g.: \"3.14 * 2\": ");
        String formula = console.nextLine();
        System.out.println("\nCalling the first method  : " + num1 + " + " 
                + num2 + " = " + calcResult(num1, num2));
        System.out.println("Calling the second method : " + num1 + " " 
                + oper + " " + num2 + " = " + calcResult(num1, num2, oper));
        System.out.println("Calling the third method  : " + formula 
                + " = "+ calcResult(formula));
    }   
    
    public static double calcResult(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double calcResult(double num1, double num2, char oper) {
        double result;
       return switch (oper) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result = 0;
        };
    }
    
    public static double calcResult(String formula) {
        int idx = formula.indexOf(' ');
        double num1 = Double.parseDouble(formula.substring(0,idx)); 
        char oper = formula.substring(idx+1).charAt(0);
        double num2 = Double.parseDouble(formula.substring(idx+3));
        
        double result = (calcResult(num1, num2, oper));
        
        return result;
    }
    
}