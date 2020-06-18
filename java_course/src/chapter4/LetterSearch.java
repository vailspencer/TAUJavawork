package chapter4;

/*
Loop Break
Search a string to determine if the it contains the letter 'A'
 */

import java.util.Scanner;

public class LetterSearch
{
    public static void main(String[] args)
    {
        //Get the text
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search for the letter A

        for(int i = 0; i<text.length(); i--)
        {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter =='a')
            {
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }

}
