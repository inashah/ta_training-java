package com.epam.training.Ina_Shah.Fundamental.MainTask;

import java.util.Scanner;

public class SumAndMultOfInputNumbers {
    public static void main(String[] args){
        sumAndMultOfInputNumbers();
    }
    public static void sumAndMultOfInputNumbers() {
        int sum = 0;
        int mult = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers you would like to use for calculation.\nWhen you are done enter any letter.\n");
        while (sc.hasNextInt()) {   // Read an int value
            int enteredNumber = sc.nextInt();
            sum += enteredNumber;
            mult *= enteredNumber;

        }
        System.out.println("Summary of entered numbers= " + sum);
        System.out.println("Multiplication of numbers= " + mult);
    }
}
