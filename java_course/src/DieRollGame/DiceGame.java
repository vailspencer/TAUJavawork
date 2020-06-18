package DieRollGame;

/*
Dice Game
Make a game that the gives you 5 rolls to move 20 spaces.
Dice option is 1-6
User needs to know what space they are on after every role.
User wins when they reach space 20 exactly.
User loses if they go over 20 rolls or if they don't reach 20 after 5 rolls
 */

import java.util.Random;

public class DiceGame
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int currentSpace = 0;
        int lastSpace = 20;
        int maxRolls = 5;

        System.out.println("Welcome to Roll the Die! Lets get started!");

        for(int i = 0; i<maxRolls; i++)
        {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace)
            {
                System.out.println("You are on space " + currentSpace + " Congrats you win!");
                break;
            }

            else if(currentSpace > lastSpace)
            {
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if(i == maxRolls && currentSpace < lastSpace)
            {
                System.out.println("Your on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it at all " + lastSpace + "spaces. you lose!");
            }
            else
                {
                    int spacesToGo = lastSpace - currentSpace;
                    System.out.println("You are on space " + currentSpace + " and have " + spacesToGo + " more to go. ");
                }
            System.out.println();


        }

    }
}
