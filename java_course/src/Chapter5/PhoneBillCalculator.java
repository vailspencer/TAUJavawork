package Chapter5;

/*
Calculate the final total of someones cell bill
I need the operator to input a plan fee and the number of minutes over.
Charge the user .25 for every minute they were over their plan, and 15% tax on the subtotal
Create separate methods to calculate the tax, fees and final total
Print the itemized bill
 */

import java.util.Scanner;

public class PhoneBillCalculator
{
    static Scanner scanner = new Scanner(System.in);
    static double tax = 0.15;
    static double fee = 0.25;

    public static void main(String[] args)
    {
        double plan = getPlanCost();
        double mins = getMinutes();
        costCalculator(plan, mins);

    }

    public static double getPlanCost()
    {
        System.out.println("What is your plan cost?");
        double cost = scanner.nextDouble();
        return cost;
    }

    public static double getMinutes()
    {
        System.out.println("How many minutes did you go over?");
        double minOver = scanner.nextDouble();
        return minOver;
    }

    public static void costCalculator(double planCost, double minutes)
    {
        double overageTotal = minutes * fee;
        double totalTax = planCost * tax + overageTotal * tax;
        double totalCost = planCost + overageTotal + totalTax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $ " + planCost);
        System.out.println("Overage: $ " + overageTotal);
        System.out.println("Tax: $ " + totalTax);
        System.out.println("Total: $ " + totalCost);
    }
}
