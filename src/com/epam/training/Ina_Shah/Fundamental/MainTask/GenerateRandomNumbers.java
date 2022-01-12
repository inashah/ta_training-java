package com.epam.training.Ina_Shah.Fundamental.MainTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenerateRandomNumbers {

    public static void main(String[] args)
    {
        GenerateRandomNumbers();
    }
    public static void GenerateRandomNumbers()
    {
        //ask user to enter amount of numbers
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter amount of numbers you would like to generate: ");
            int inputNumber = sc.nextInt();
            int[] numbersArray = generateArray(inputNumber);
            printArrayInOneLine(inputNumber, numbersArray);
            printArrayInNewLine(inputNumber, numbersArray);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number.");}

    }

    private static int[] generateArray (int inputNumber)
    {
        int[] numbersArray = new int[inputNumber];
        //generate array
        for (int i = 0; i < inputNumber; i++) {
            numbersArray[i] = (int) (Math.random() * 100);
        }
        return (numbersArray);
    }

    private static void printArrayInOneLine(int inputNumber, int[] numbersArray) {
        System.out.println("Here is random numbers in one line: ");
        for (int i = 0; i < inputNumber; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }
    private static void printArrayInNewLine (int inputNumber, int[] numbersArray)
    {
        System.out.println("\nHere is random numbers in new line:");
        for (int b = 0; b < inputNumber; b++) {
            System.out.print(numbersArray[b]+"\n");
        }
    }
}
