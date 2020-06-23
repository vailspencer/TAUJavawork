package Chapter8;

import java.util.Scanner;

public class PasswordValidator
{
    private static Scanner scanner = new Scanner(System.in);
    private static String username;
    private static String password;
    private static boolean valid;
    private static String errormessage;

    public static void main(String[] args)
    {
        createUser();
        createPassword();
        checkPassword(password, username);

    }

    public static String createUser(){
        System.out.println("What is your username?");
        username = scanner.next();
        return username;
    }

    public static String createPassword(){
        System.out.println("Please create a password that meets the following requirements:");
        System.out.println("At least 8 characters long");
        System.out.println("Contains an uppercase letter");
        System.out.println("Contains a special character");
        System.out.println("Does not contain the username");
        System.out.println("Is not the same as the last password");
        System.out.println("What would you like your password to be? ");
        password = scanner.next();
        return password;
    }
    public static void checkPassword(String password, String username)
    {
        valid = true;
        errormessage = "";

        if(password.length() < 8){
            valid = false;
            errormessage += "\n Your password must be at least 8 characters long.";
        }

        if(password.equals(password.toLowerCase())){
            valid = false;
            errormessage += "\n Your password must contain at least one uppercase characters.";
        }

        if(password.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errormessage += "\n Your password must contain a special character";
        }

        if(password.contains(username)){
            valid = false;
            errormessage += "\n Your password must not include your username";
        }

        if(valid == true){
            System.out.println("Thank your password has been updated!");
        } else {
            System.out.println(errormessage);
        }
    }
}
