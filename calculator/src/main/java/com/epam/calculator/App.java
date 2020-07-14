package com.epam.calculator;


import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // nextDouble() reads the next double from the keyboard
        while(true) {
        	System.out.println();
        	System.out.println("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        System.out.println("Enter any other character to exit");
        CalcMethods c = new CalcMethods(first, second);
        char operator = reader.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = c.add(first,second);
                break;
            case '-':
                result = c.sub(first,second);
                break;
            case '*':
                result = c.mul(first,second);
                break;
            case '/':
                result = c.div(first,second);
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.println("you have unfortunately Exited my calculator program :( ..We are sorry to see yoou go!.");
                reader.close();              
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        }
    }
}
