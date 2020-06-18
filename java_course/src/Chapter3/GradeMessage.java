package Chapter3;

import java.util.Scanner;

public class GradeMessage
{
    public static void main (String[] args)
    {
        System.out.println("Please provide your letter grade:");
            Scanner scanner = new Scanner(System.in);
            String grade = scanner.next();

            String message;

            switch(grade)
            {
                case "A":
                    message = "Excellent Job!";
                    break;
                case "B":
                    message = "Great Job!";
                    break;
                case "C":
                    message = "Good Job!";
                    break;
                case "D":
                    message = "You need to try harder next time";
                    break;
                case "F":
                    message = "You can certainly get better from here!";
                    break;
                default:
                    message = "Error, Invalid Grade!";
                    break;
            }

            System.out.println(message);

    }
}
