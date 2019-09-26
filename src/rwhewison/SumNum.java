package rwhewison;

import java.util.Scanner;

class SumNum {
    //Description: Testing out using methods: finds sum of two numbers
    static void addNumbers() {
        Scanner reader = new Scanner(System.in);
        int firstNum;
        int secondNum;
        System.out.println("ADD NUMBERS");
        System.out.println("Enter first number: ");
        firstNum = reader.nextInt();
        System.out.println("Enter second number: ");
        secondNum = reader.nextInt();
        System.out.println("Total: " + sum(firstNum,secondNum));
    }
    private static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
