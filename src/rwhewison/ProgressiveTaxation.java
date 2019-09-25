package rwhewison;

import java.util.Scanner;

class ProgressiveTaxation {
    /* [2019-07-15] Challenge #379 [Easy] Progressive taxation
     * Description: Given an income calculates tax amount using the progressive tax rates below
     * Max Income: $100,000,000
     * income cap      marginal tax rate
     *   $10,000           0.00 (0%)
     *   $30,000           0.10 (10%)
     *  $100,000           0.25 (25%)
     *     --              0.40 (40%)
     * TODO:
     *  Allow use ability to change marginal tax rates for each bracket
     *  Find way of making some of the things into their own methods
     *  Calculate and display overall tax rate
     *
     * FIXME:
     *  Make variables neater
     *  Make it more efficiently using loops
     */
    static void progressiveTax() {
        //Declare variables
        int income;
        int incomeMax;
        int incomeTemp;
        int incomeTaxed;
        int firstBracket;
        int secondBracket;
        int thirdBracket;
        int secondBracketDifference;
        int thirdBracketDifference;
        double firstBracketRate;
        double secondBracketRate;
        double thirdBracketRate;
        double taxTotal;
        incomeMax = 100000000;
        taxTotal = 0;
        firstBracket = 10000;
        secondBracket = 30000;
        thirdBracket = 100000;
        secondBracketDifference = 20000;
        thirdBracketDifference = 70000;
        firstBracketRate = 0.10;
        secondBracketRate = 0.25;
        thirdBracketRate = 0.40;
        //User input
        Scanner reader = new Scanner(System.in);
        System.out.println("PROGRESSIVE TAXATION");
        System.out.println("Enter in your income: ");
        income = reader.nextInt();
        //Find tax bracket
        incomeTemp = income;
        if (income <= firstBracket) {
            taxTotal = 0;
        }
        else if (income > firstBracket && income < secondBracket) {
            incomeTemp = incomeTemp - firstBracket;
            taxTotal = incomeTemp * firstBracketRate;
        }
        else if (income > secondBracket && income < thirdBracket) {
            incomeTemp = incomeTemp - firstBracket;
            taxTotal = taxTotal + (secondBracketDifference * firstBracketRate);
            incomeTemp = incomeTemp - secondBracketDifference;
            taxTotal = taxTotal + (incomeTemp * secondBracketRate);
        }
        else if (income > thirdBracket && income < incomeMax) {
            incomeTemp = incomeTemp - firstBracket;
            taxTotal = taxTotal + (secondBracketDifference * firstBracketRate);
            incomeTemp = incomeTemp - secondBracketDifference;
            taxTotal = taxTotal + (thirdBracketDifference * secondBracketRate);
            incomeTemp = incomeTemp - thirdBracketDifference;
            taxTotal = taxTotal + (incomeTemp * thirdBracketRate);
        }
        else {
            System.out.println("income too high");
        }
        incomeTaxed = (int) (income - taxTotal);
        if (income < incomeMax) {
            System.out.println("tax(" + income + ") ==> " + (int) taxTotal + " ==> " + incomeTaxed);
        }
    }

}
