package Chapter5;

/*
Variable Scope
Write an instant credit check program that approves
anyone who makes more than 25k and has a credit score of
700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck
{
    static int income = 25000;
    static int creditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double salary = getFormSalary();
        int credit = getFormCredit();
        boolean qualified = isUserQualified(credit, salary);
        scanner.close();
        notifyUser(qualified);
    }
     public static double getFormSalary()
     {
         System.out.println("What is your salary?");
         double salary = scanner.nextDouble();
         return salary;
     }

     public static int getFormCredit()
     {
         System.out.println("What is your credit score?");
         int credit = scanner.nextInt();
         return credit;
     }

     public static boolean isUserQualified(int credit, double salary)
     {
         if(credit >= creditScore && salary >= income){
             return true;
         } else {
             return false;
         }
     }

     public static void notifyUser(boolean isQualified)
     {
        if(isQualified == true)
        {
            System.out.println("Congrats you qualify for the loan");
        } else {
            System.out.println("I am sorry you do not qualify");
        }
     }

}
