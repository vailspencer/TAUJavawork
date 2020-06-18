package Chapter3;
/*
If Statement

All sales people get 1k a week
salespeople who                   ed 10 sales get a bonus of 250
 */

import java.util.Scanner;

public class salaryCalculator
{
    public static void main (String[] args)
    {
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Quick detour for the bonus earner
        if(sales > quota)
        {
            salary = salary + bonus;
        }

        //Output results
        System.out.println("The Employees pay is $" + salary);
    }

}
