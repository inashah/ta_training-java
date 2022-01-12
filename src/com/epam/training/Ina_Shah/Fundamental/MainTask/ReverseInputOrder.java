package com.epam.training.Ina_Shah.Fundamental.MainTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseInputOrder {

    public static void main(String[] args){
        ReverseInputOrder();
    }

    public static void ReverseInputOrder() {
        String input = getInput();
        if (input.length() != 0) {
            reverseOrder(input);
        }
        else {
            System.out.print("You should enter parameters");
        }
    }
    private static String getInput()
    {
        String initialInput = new String();
        try {
            InputStreamReader inputParameters = new InputStreamReader(System.in);
            BufferedReader bufParameters = new BufferedReader(inputParameters);
            //ask to enter parameters
            System.out.println("Please, enter  in one line parameters you want to reverse: ");
            //reading of input
            initialInput = bufParameters.readLine();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        return initialInput;
    }

    private static void reverseOrder(String initialInput)
    {
        StringBuilder reverseInput = new StringBuilder();
        reverseInput.append(initialInput); //add input to reverse variable
        reverseInput.reverse();
        System.out.println("Reverse order of entered parameters: " + reverseInput);
    }
}

