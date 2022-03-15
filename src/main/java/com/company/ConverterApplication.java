package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        // instantiation
        ConverterIf convert = new ConverterIf();
        ConverterSwitch convertS = new ConverterSwitch();
        Scanner scan = new Scanner(System.in);

        // take input from the console for the day
        System.out.println("Please enter a number for the day: ");
        int userInput = scan.nextInt();
        int userDay = userInput;

        // call methods to convert input for if and switch - day
        String dayIf = convert.convertDay(userDay);
        String daySwitch = convertS.convertDay(userDay);

        System.out.println("If statement day converter: " + dayIf);
        System.out.println("Switch statement day converter: " + daySwitch);

        // take input from the console for the month
        System.out.println("\nPlease enter a number for the month: ");
        userInput = scan.nextInt();
        int userMonth = userInput;

        // call methods to convert input for if and switch - month
        String monthIf = convert.convertMonth(userMonth);
        String monthSwitch = convertS.convertMonth(userMonth);

        System.out.println("If statement day converter: " + monthIf);
        System.out.println("Switch statement day converter: " + monthSwitch);

    }
}
