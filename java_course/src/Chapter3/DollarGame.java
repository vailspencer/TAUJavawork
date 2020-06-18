package Chapter3;

import java.util.Scanner;

public class DollarGame
{
    public static void main (String[] args)
    {
        // Ask the user for the qunatities of the coins
        double pennies = .01;
        double nickles = .05;
        double dimes = .10;
        double quarters = .25;
        int dollar = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("To win the game only enter the exact amount of change that will equal to 1 dollar.");

        System.out.println("How many pennies would you like:");
        int numOfPennies = scanner.nextInt();
        System.out.println("How many nickles would you like:");
        int numOfNickles = scanner.nextInt();
        System.out.println("How many dimes would you like:");
        int numOfDimes = scanner.nextInt();
        System.out.println("How many quarters would you like:");
        int numOfQuarters = scanner.nextInt();
        scanner.close();


        double total = numOfPennies * pennies + numOfNickles * nickles + numOfDimes * dimes + numOfQuarters * quarters;


        // count up the values
        if( total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short by " + String.format("%.2f", amountShort) + "cents.");
        } else if (total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over by " + String.format("%.2f", amountOver) + "cents");
        } else {
            System.out.println("Congrats! That is exactly $1.00 you win!");
        }


        // Determine if they win or lose

        // Determine how much they lost by
    }
}
