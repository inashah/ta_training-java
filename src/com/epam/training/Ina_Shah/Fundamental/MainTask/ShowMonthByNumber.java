package com.epam.training.Ina_Shah.Fundamental.MainTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowMonthByNumber {

    public static void main(String[] args)
    {
        showMonth ();
    }
    public static void showMonth () {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number of month: ");
            int monthNumber = sc.nextInt();

            if (monthNumber > 0 & monthNumber <= 12) {
                getMonth(monthNumber);
            }else {
                System.out.println("Month number should be from 1 to 12.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number from 1 to 12");
        }
    }
    public static void getMonth ( int month)
    {
        String monthName = new String();
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        System.out.println("You selected month of: " + monthName);
    }
}
