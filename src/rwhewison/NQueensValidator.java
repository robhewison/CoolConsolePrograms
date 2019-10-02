package rwhewison;

import java.util.Arrays;

public class NQueensValidator {
    /* [2018-12-31] Challenge #371 [Easy] N queens validator
     *
     */
    public static  void main(String[] args) {
    int[] NQueenArray = new int[]{4, 2, 7, 3, 6, 8, 5, 1};
        System.out.println( "qcheck(" + Arrays.toString(NQueenArray) + ") ==> " + qCheck(NQueenArray));
    }
    private static boolean qCheck(int[] nqueen) {
        for (int i = 0; i < nqueen.length; i++)
            for (int j = 0; j < nqueen.length; j++)
                if (i != j && (nqueen[i] == nqueen[j] || Math.abs(nqueen[i] - nqueen[j]) == Math.abs(i-j)))
                    return false;
        return true;
    }
}
