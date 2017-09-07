/*
    Second Project Microsoft Java Course
    Game Odds and Evens
 */
import java.util.*;

public class OddsAndEvens {

    public static void main(String[] args) {
        //New Scanner
        Scanner input = new Scanner(System.in);

        //Greet and user name input
        System.out.println("\nLet's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String userName = input.next();
        System.out.print("Hi " + userName + ", which do you choose? (O) for Odds or (E) for Evens? ");

        //Skip rest of line and wait fo user input
        input.nextLine();
        String userPick = input.next();

        //If  user inputs an invalid character ask again
        while (!(userPick.equalsIgnoreCase("e")) && !(userPick.equalsIgnoreCase("o"))){
            System.out.print("Please pick a valid character, (O) for Odds or (E) for Evens ");
            userPick = input.next();
        }

        //Print to console user's pick
        if (userPick.equalsIgnoreCase("e")) {
            System.out.println(userName + " has picked evens! The computer will be odds.");
        }
        else {
            System.out.println(userName + " has picked odds! The computer will be evens.");
        }
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");

        game(input, userPick, userName);

    }

    public static void game(Scanner input, String userPick, String userName){
        //Ask user to pick the number of fingers
        System.out.print("How many \"finger(s)\" do you put out? ");
        int userNum = input.nextInt();

        //Generate random number for computer
        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.println("The computer plays " + computer + " \"finger(s)\".");
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");

        int totalSum = computer + userNum;
        System.out.println(userNum + " + " + computer + " = " + totalSum);

        //Decide if sum is even or odd and announce the winner
        if ((totalSum % 2) == 0){
            System.out.println(totalSum + " is ...even");
            if (userPick.equalsIgnoreCase("e")){
                System.out.println("That means " + userName + " wins");
            }
            else {
                System.out.println("That means the computer wins");
            }
        }
        else {
            System.out.println(totalSum + " is ...odd");
            if (userPick.equalsIgnoreCase("o")){
                System.out.println("That means " + userName + " wins");
            }
            else {
                System.out.println("That means the computer wins");
            }
        }
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");

    }
}
