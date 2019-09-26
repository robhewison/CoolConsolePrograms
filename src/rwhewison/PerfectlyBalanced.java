package rwhewison;

public class PerfectlyBalanced {
    /* [2019-01-14] Challenge #372 [Easy] Perfectly balanced
     * Description: Given a string containing only the characters x and y, find whether there are same number of them
     *
     * TODO:
     *  Allow user input
     *  Do bonus
     *
     */
    public static void main(String[] args) {
        String balance = "yyyxxx";
        int yAmount = 0;
        int xAmount = 0;
        String[] balanceArray = balance.split("");
        for (int i = 0; i < balance.length(); i++) {
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
                    System.out.println("Error: string must contain 'x' or 'y'");
                    break;
            }
        }
        if (yAmount == xAmount) {
            System.out.println("balanced(" + "\"" + balance + "\"" + ") ==> true");
        }
        else {
            System.out.println("balanced(" + "\"" + balance + "\"" + ") ==> false");
        }
    }
}
