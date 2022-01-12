package com.epam.training.Ina_Shah.Fundamental.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {
    public static void main(String[] args) {
        HelloUser();
    }

    public static void HelloUser() {
        try {
            InputStreamReader inputName = new InputStreamReader(System.in);
            BufferedReader bufName = new BufferedReader(inputName);
            //ask for username
            System.out.print("Please enter your name ");
            String userName = bufName.readLine();
            //say hello to user
            System.out.println("Hello, " + userName + "!");
        } catch (IOException ioe) {
            System.out.println("Exception");
        }
    }
}
