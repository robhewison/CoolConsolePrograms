package coolconsoleprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetCipher {
    /* [2018-03-26] Challenge #355 [Easy] Alphabet Cipher
     * Unfinished
     *
     * TODO:
     *  Once program is created change method to alphabetCipher()
     *
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] secretAndMessage;
        String secretWord, message;
        System.out.print("Enter secret word and message: ");
        secretAndMessage = reader.nextLine().split(" ");
        secretWord = secretAndMessage[0];
        message = secretAndMessage[1];
        System.out.println("Secret Word: " + secretWord + " Message: " + message);
        for (int i = 0; secretWord.length() < message.length(); i++) {
            secretWord = secretWord + secretWord;
            if (secretWord.length() > message.length()) {
                secretWord = secretWord.substring(0, message.length());
            }
        }
        System.out.println(secretWord);
        System.out.println(message);

        int start = 0;
        int end = message.length();
        while (start < end) {
            char temp = alphabet[start];
            alphabet[start] = alphabet[end];
            alphabet[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(alphabet));
    }
}
