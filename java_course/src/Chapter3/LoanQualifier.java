package Chapter3;
/*
Nested Ifs:
To qualify for a loan a person must make at least $30,000 and
have been working at their current job for at least 2 years.
 */


import java.util.Scanner;

public class LoanQualifier
{
    public static void main (String[] args)
    {
        // Initialize what we know
            int requiredSalary = 30000;
            int requiredYearsEmlployed = 2;
        // Get what we don't know
        System.out.println("Enter your Salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();
        scanner.close();

        // Make decision
        if(salary >= requiredSalary)
        {
            if(years >= requiredYearsEmlployed)
            {
                System.out.println("Congrats you qualified for the loan");
            } else {
                System.out.print("Sorry you must have worked at your current job for " + requiredYearsEmlployed + " years.");
            }
        } else {
            System.out.print(" Sorry you must have a salary of at least " + requiredSalary + " to qualify for the loan");
        }

    }
}
