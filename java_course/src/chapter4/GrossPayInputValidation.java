package chapter4;

/*
* While Loop
* Each store employee makes $15 an hour. Write a program that allows the employee
*  to enter the number of hours worked for the week. Do not allow for Overtime.
* */

import java.util.Scanner;

public class GrossPayInputValidation
{
    public static void main(String[] args)
    {
        //initialize values
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables.

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input

        while(hoursWorked > maxHours || hoursWorked < 1)
        {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate the gross

        double gross = rate * maxHours;
        System.out.println("Gross pay: $" + gross);
    }
}
