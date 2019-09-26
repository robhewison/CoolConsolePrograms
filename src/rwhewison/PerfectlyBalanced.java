package rwhewison;

import java.util.Scanner;

class PerfectlyBalanced {
    /* [2019-01-14] Challenge #372 [Easy] Perfectly balanced
     * Description: Given a string containing only the characters x and y, find whether there are same number of them
     *
     * TODO:
     *  Do bonus
     *  FIXME:
     *   balanced("x x") ==> false (Find a way to allow spaces in the String)
     */
    static void balance() {
        Scanner reader = new Scanner(System.in);
        String balance;
        String goAgain = "";
        boolean balanceCheck;
        System.out.println("PERFECTLY BALANCED");
        System.out.println("(type 'help' for more info)");
        do{
            do{
                System.out.println("Enter in certain number of 'x' and 'y':");
                balance = reader.nextLine();
                if (balance.equals("Help") || balance.equals("help")) {
                    helpMenu();
                }
                else {
                    balanceCheck = balancing(balance);
                    if (balanceCheck == true) {
                        System.out.println("balanced(" + "\"" + balance + "\"" + ") ==> true");
                    }
                    else {
                        System.out.println("balanced(" + "\"" + balance + "\"" + ") ==> false");
                    }
                    goAgain = askConvertAgain();
                }
            }while (balance.equals("Help") || balance.equals("help"));
        }while (goAgain.equals("Y") || goAgain.equals("y") || goAgain.equals("Yes") || goAgain.equals("yes"));
        System.out.println("Goodbye");
    }

    private static String askConvertAgain() {
        //Taken from SmooshedMorseCode.java and modified
        String goAgain;
        do{
            System.out.println("Check another for balanced characters? (y/n)");
            Scanner reader = new Scanner(System.in);
            goAgain = reader.nextLine();
            if (!goAgain.equals("Y") && !goAgain.equals("y") && !goAgain.equals("Yes") && !goAgain.equals("yes") && !goAgain.equals("N") && !goAgain.equals("n") && !goAgain.equals("No") && !goAgain.equals("no")) {
                System.out.println("Invalid input: enter yes or no");
            }
        }while (!goAgain.equals("Y") && !goAgain.equals("y") && !goAgain.equals("Yes") && !goAgain.equals("yes") && !goAgain.equals("N") && !goAgain.equals("n") && !goAgain.equals("No") && !goAgain.equals("no"));
        return goAgain;
    }

    //Checks if given string has same number of 'x' and 'y' and returns true or false
    private static boolean balancing(String checkBalance) {
        int yAmount = 0;
        int xAmount = 0;
        boolean isBalanced;
        String[] balanceArray = checkBalance.split("");
        for (int i = 0; i < checkBalance.length(); i++) {
            switch (balanceArray[i]) {
                case "y":
                    yAmount++;
                    break;
                case "x":
                    xAmount++;
                    break;
                case "":
                    break;
                default:
                    System.out.println("Error: string must contain only 'x' or 'y'");
                    return isBalanced = false;
            }
        }
        if (yAmount != xAmount) {
            if (xAmount == 0) {
                isBalanced = true;
            }
            else if (yAmount == 0) {
                isBalanced = true;
            }
            else {
                isBalanced = false;
            }
        }
        else {
            isBalanced = true;
        }
        return isBalanced;
    }
    //Displays more information (taken from DiceRoll.java and modified to fit PerfectlyBalanced.java)
    private static void helpMenu() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("PERFECTLY BALANCED: MORE INFORMATION");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Enter in certain number of 'x' and 'y' and see if they're the same amount");
        System.out.print("balanced(\"xxyyxxyy\") ==> true");
        System.out.print(" balanced(\"xxxyy\") ==> false\n");
        System.out.println("Created by Rob Hewison 2019 Github: https://github.com/robhewison");
        System.out.println("--------------------------------------------------------------------");
    }
}
