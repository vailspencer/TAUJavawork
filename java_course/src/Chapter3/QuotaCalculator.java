package Chapter3;

import java.util.Scanner;

/* If Else
All Salespeople are expected to make at leats 10 sales each week.
For those who do, they get a congrats message.
For those who do not, they are informed of how many sales they were short.

*/
public class QuotaCalculator
{
    public static void main(String[] args)
    {
        // Initialize values we know
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the amount of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on the paht to take - Outputh
        if (sales >= quota)
        {
            System.out.println("Congrats!! The man is richer you are a little bit richer");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quote. You were " + salesShort + " sales short");
        }

    }
}
