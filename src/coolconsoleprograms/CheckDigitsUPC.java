package coolconsoleprograms;

import java.util.Scanner;

class CheckDigitsUPC {
    /* [2018-12-17] Challenge #370 [Easy] UPC check digits
     * Description: Type in first 11 UPC (barcode) numbers and print out check number
     */
    static void upcCheck() {
        Scanner reader = new Scanner(System.in);
        String first11UPC;
        String goAgain;
        System.out.println("UPC NUMBER CHECKER");
        do{
            System.out.println("Enter first 11 digits of UPC Number: ");
            first11UPC = reader.nextLine();
            System.out.println(first11UPC + " ==> " + upc(first11UPC));
            System.out.println("Go again? (y/n)");
            goAgain = reader.nextLine();
        }while (goAgain.equals("Y") || goAgain.equals("y") || goAgain.equals("Yes") || goAgain.equals("yes"));
        System.out.println("Goodbye");
    }
    //Method below converts first 11 digits of UPC value into final digit
    private static int upc(String upcValue) {
        int evenSum = 0;
        int oddSum = 0;
        int totalSum;
        int M;
        int checkNumber;
        if (upcValue.length() < 11) {
            upcValue = ("00000000000" + upcValue).substring(upcValue.length());
        }
        else {

        }

        int[] upcList = upcValue.chars().map(Character::getNumericValue).toArray();
        for (int i = 0; i < upcValue.length(); i++) {
            if (i % 2 == 0) {
                evenSum += upcList[i];
            }
            else {
                oddSum += upcList[i];
            }
        }

        evenSum *= 3;
        totalSum = oddSum + evenSum;
        M = totalSum % 10;

        if (M == 0) {
            checkNumber = M;
        }
        else {
            checkNumber = 10 - M;
        }
        return checkNumber;
    }
}
