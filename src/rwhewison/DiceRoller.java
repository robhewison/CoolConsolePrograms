package rwhewison;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Random;

class DiceRoller {
    /* [2018-06-18] Challenge #364 [Easy] Create a Dice Roller
     * Description:
     * User inputs dice roll amount between 1-100 in the format (amount of rolls)d(amount of die faces)
     * example: 3d20 would be 3 rolls of a 20 sided die
     * It displays each roll and gives roll total and then asks user if they want to go again
     * Old: public static void main(String[] args) throws ParseException
     *
     * TODO:
     *  Allow for multiple die faces at once (so 4d20, 2d6, 3d5 will be called all at once
     *  Add GUI
     *
     */
    static void diceRoller() throws ParseException {
        Scanner reader = new Scanner(System.in);
        String diceRoll;
        int dieFaces;
        int rollNum;
        int rollTotal;
        int rollAgain;
        dieFaces = 0;
        rollNum = 0;
        System.out.println("DICE ROLL GENERATOR");
        System.out.println("(type 'help' for more info)");
        do{
            do{
                do{
                    System.out.println("Enter in dice roll: ");
                    //FIXME: If someone types something incorrect into dice roll String the program crashes
                    diceRoll = reader.nextLine();
                    if (diceRoll.equals("Help") || diceRoll.equals("help")) {
                        helpMenu();
                    }
                    else {
                        //FIXME: Require user to use 'd' between numbers, currently any String between works (example: 3dsfe6 => 3d6)
                        String[] part = diceRoll.split("(?<=\\D)(?=\\d)");
                        String rollNumString = part[0];
                        dieFaces = Integer.parseInt(part[1]);
                        rollNum = NumberFormat.getInstance().parse(rollNumString).intValue();
                    }
                }while (diceRoll.equals("Help") || diceRoll.equals("help"));
                if (dieFaces < 1 || dieFaces > 100 || rollNum < 1 || rollNum > 100) {
                    System.out.println("Invalid input: number must be between 1-100");
                }
            }while (dieFaces < 1 || dieFaces > 100 || rollNum < 1 || rollNum > 100);
            //Do dice rolling calculations
            rollTotal = rollDice(dieFaces, rollNum);
            //Display dice roll total
            System.out.println();
            System.out.println("Dice Total: " + rollTotal);
            //Asks user if they want to go again
            rollAgain = rollAgainPrompt();
        }while (rollAgain == 1);
    }
    //Method takes faces on the die and number of rolls then randomly rolls them and calculates total
    private static int rollDice(int dieFaces, int rollNum) {
        Random rand = new Random();
        int rollTotal;
        int counter;
        rollTotal = 0;
        counter = 0;
        for (int i = 0; i < rollNum; i++) {
            int roll = rand.nextInt(dieFaces);
            roll += 1;
            rollTotal += roll;
            //Prints 10 numbers per line
            if (counter == 10) {
                counter = 0;
                System.out.println();
                System.out.print(roll + " ");
            }
            else {
                System.out.print(roll + " ");
            }
            counter++;
        }
        return rollTotal;
    }
    //Method asks user if they would like to roll again
    private static int rollAgainPrompt() {
        Scanner reader = new Scanner(System.in);
        String rollAgain;
        int yesRoll;
        int ynError;
        yesRoll = 0;
        do{
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Roll again? (y/n)");
            rollAgain = reader.nextLine();
            if (rollAgain.equals("Y") || rollAgain.equals("y") || rollAgain.equals("Yes") || rollAgain.equals("yes")) {
                yesRoll = 1;
                return yesRoll;
            }
            if (rollAgain.equals("N") || rollAgain.equals("n") || rollAgain.equals("No") || rollAgain.equals("no")) {
                System.out.println("Goodbye");
                yesRoll = 0;
                return yesRoll;
            }
            else {
                System.out.println("Invalid input: enter 'yes' or 'no'");
                ynError = 1;
            }
        }while (ynError == 1);
        return yesRoll;
    }
    private static void helpMenu() {
        //Displays more information
        System.out.println("--------------------------------------------------------------------");
        System.out.println("DICE ROLL GENERATOR: MORE INFORMATION");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Format: (amount of rolls)d(amount on die face) E.g. 3d10 => 9 2 6");
        System.out.println("Each number must be between 1-100 with 'd' separating them");
        System.out.println("Created by Rob Hewison 2019 Github: https://github.com/robhewison");
        System.out.println("--------------------------------------------------------------------");
    }
}
