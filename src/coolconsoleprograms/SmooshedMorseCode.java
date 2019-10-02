package coolconsoleprograms;

import java.util.Scanner;

class SmooshedMorseCode {
    /** [2019-08-05] Challenge #380 [Easy] Smooshed Morse Code 1
     *  Description: Converts a given String to smooshed morse code (morse code without spaces)
     *
     *  TODO:
     *   Once program is finalized change method to morseCode() from main(String[] args) method and add to Main
     *   Using the raw set of words given on the reddit post do the optional challenge
     *   Maybe make it so once program is over it smooshes all the words you converted to one and prints it out
     *
     *  FIXME:
     *   Is there a way to do this without making alphabet an array?
     *
     *
     */
    static void morseCode() {
        String goAgain;
        String word;
        String smorse;
        Scanner reader = new Scanner(System.in);
        System.out.println("MORSE CODE GENERATOR");
        do{
            //User input
            System.out.println("Enter word to be converted: ");
            word = reader.nextLine();
            // Where morseConvert went
            smorse = morseConverter(word);
            System.out.println("smorse(\"" + word + "\") ==> " + "\"" + smorse + "\"");
            goAgain = askConvertAgain();
        }while (goAgain.equals("Y") || goAgain.equals("y") || goAgain.equals("Yes") || goAgain.equals("yes"));
        System.out.println("Goodbye");
    }
    //Method below converts given word in parameter to smooshed morse code
    private static String morseConverter(String wordToConvert) {
        String smorseString;
        StringBuilder smorse = new StringBuilder();
        //Creating array for morseAlphabet and normal alphabet to compare the two
        String[] morseAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] wordArray = wordToConvert.toCharArray();
        //Comparing each char in word to it's position in the alphabet array then using that position for smorse array
        for (char c : wordArray) {
            for (int j = 0; j < alphabet.length; j++) {
                if (c == alphabet[j]) {
                    smorse.append(morseAlphabet[j]);
                }
            }
        }
        /*
         * OLD WAY OF DOING ABOVE (Intellij recommended doing it the other way)
         * for (int i = 0; i < wordArray.length; i++) {
         *             for (int j = 0; j < alphabet.length; j++) {
         *                 if (wordArray[i] == alphabet[j]) {
         *                     System.out.print(morseAlphabet[j]);
         *                 }
         *             }
         *         }
         */
        //Return morse code converted from word
        smorseString = smorse.toString();
        return smorseString;
    }
    //Method asks user if they want to convert another String to morse code (made to help readability)
    private static String askConvertAgain() {
        String goAgain;
        do{
            System.out.println("Would you like convert another word? (y/n)");
            Scanner reader = new Scanner(System.in);
            goAgain = reader.nextLine();
            if (!goAgain.equals("Y") && !goAgain.equals("y") && !goAgain.equals("Yes") && !goAgain.equals("yes") && !goAgain.equals("N") && !goAgain.equals("n") && !goAgain.equals("No") && !goAgain.equals("no")) {
                System.out.println("Invalid input: enter yes or no");
            }
        }while (!goAgain.equals("Y") && !goAgain.equals("y") && !goAgain.equals("Yes") && !goAgain.equals("yes") && !goAgain.equals("N") && !goAgain.equals("n") && !goAgain.equals("No") && !goAgain.equals("no"));
        return goAgain;
    }

}
