package chapter2; // The package

import java.util.Scanner;

public class GrossPayCalculator // The class
{
    public static void main(String[] args) // The Method
    {
        System.out.println("Enter the number of hours the employee worked."); // A statment that prints text in the console.
        Scanner scanner = new Scanner(System.in);
       int hours = scanner.nextInt();

        System.out.println("Enter the employees pay rate");
        double rate = scanner.nextDouble();
        // scanner.close();

        double grossPay = hours * rate;

        System.out.println("The employees gross pay is " + grossPay);

        System.out.println("Give me a season of the year");
        String season = scanner.next();

        System.out.println("whole number");
        int year = scanner.nextInt();

        System.out.println("Enter an adjective ");
        String numberOfCups = scanner.next();

        System.out.println("On a " + numberOfCups + " " + season + "day, I drink a minimum of " + year + " cups of coffee ");



    }
}
