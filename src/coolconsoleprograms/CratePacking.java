package coolconsoleprograms;

class CratePacking {
    /**[2019-04-08] Challenge #377 [Easy] Axis-aligned crate packing
     * Description:
     * Program tells user how many 2-dimensional boxes fit inside a larger 2d box
     *
     * TODO:
     *  Optional bonus: fit3 (See reddit post)
     *  Get user input for box sizes
     */
    static void cratePacking() {
        int bigX;
        int bigY;
        int smallX;
        int smallY;
        int boxFit1;
        int boxFit2;
        bigX = 25;
        bigY = 18;
        smallX = 6;
        smallY = 5;
        boxFit1 = fit1(bigX, bigY, smallX, smallY);
        boxFit2 = fit2(bigX, bigY, smallX, smallY);
        System.out.println("CRATE PACKING");
        System.out.println("fit1(" + bigX + ", " + bigY + ", " + smallX + ", " + smallY + ")" + " ==> " + boxFit1);
        System.out.println("fit2(" + bigX + ", " + bigY + ", " + smallX + ", " + smallY + ")" + " ==> " + boxFit2);

    }
    //Method calculates how many boxes will fit inside if boxes are straight up
    private static int fit1(int bigX, int bigY, int smallX, int smallY) {
        int fit1 = (bigX / smallX)*(bigY / smallY);
        return fit1;
    }
    //Method calculates how many boxes will fit inside if rotated 90 degrees
    private static int fit2(int bigX, int bigY, int smallX, int smallY) {

        int fit2 = (bigX / smallY)*(bigY / smallX);
        return fit2;
    }
}
