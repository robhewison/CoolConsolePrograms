package coolconsoleprograms;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /* MAIN PROGRAM
         * Description: Main program that calls the other subprograms such as DiceRoller, CheckDigitsUPC, AnimalStore, etc
         *
         * TODO:
         *  Make subprograms (subclasses) private - look up best practices before doing this
         *  Finish AlphabetCipher.class
         *  Add any programs made after this Main.class was created
         *  Reorganize the order of the programs in the PICK ONE menu
         *  Maybe add row of "-------" after CAPITAL NAME for each program (inside each subprogram)
         *
         * FIXME:
         *  Add only ability to catch exception of someone entering a String into program selection
         *  If someone enters something other than yes or no into "choose another?"  then program just ends
         *  Create better title than PROGRAMS: PICK ONE ==> now it's COOL PROGRAMS: PICK ONE, could it be better?
         *   [fixed but find out why] Error:(47, 34) java: unreported exception java.text.ParseException; must be caught or declared to be thrown
         *      > Why does throws ParseException need to be added (the fix for the error above)
         */
        //Declare variables
        int programChoice;
        String chooseAnother;
        Scanner reader = new Scanner(System.in);
        //Program selection loop
        do{
            System.out.println("--------------------------------------------------------------------");
            System.out.println("COOL PROGRAMS: SELECT ONE");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("(1) PROGRESSIVE TAXATION");
            System.out.println("(2) DICE ROLL GENERATOR");
            System.out.println("(3) MORSE CODE GENERATOR");
            System.out.println("(4) RANDOM NAME GENERATOR");
            System.out.println("(5) UPC NUMBER CHECKER");
            System.out.println("(6) ANIMAL STORE");
            System.out.println("(7) ADD NUMBERS");
            System.out.println("(8) CRATE PACKING");
            System.out.println("(9) PERFECTLY BALANCED");
            System.out.println("What program would you like?:");
            programChoice = reader.nextInt();
            System.out.println("Program selected: " + programChoice);
            //Check which program user selects
            if (programChoice == 1) {
                ProgressiveTaxation.progressiveTax();
            }
            else if (programChoice == 2) {
                DiceRoller.diceRoller();
            }
            else if (programChoice == 3) {
                SmooshedMorseCode.morseCode();
            }
            else if (programChoice == 4) {
                RandomNameGen.namegen();
            }
            else if (programChoice == 5) {
                CheckDigitsUPC.upcCheck();
            }
            else if (programChoice == 6) {
                AnimalStore.animalStore();
            }
            else if (programChoice == 7) {
                SumNum.addNumbers();
            }
            else if (programChoice == 8) {
                CratePacking.cratePacking();
            }
            else if (programChoice == 9) {
                PerfectlyBalanced.balance();
            }
            else {
                System.out.println("Invalid input: enter number 1-9");
            }
            System.out.println("Would you like to choose another program? (y/n)");
            reader.nextLine();
            chooseAnother = reader.nextLine();
        }while (chooseAnother.equals("Y") || chooseAnother.equals("y") || chooseAnother.equals("Yes") || chooseAnother.equals("yes"));
        //Tell user program is over
        System.out.println("GOODBYE! ENDING PROGRAM...");



    }
}
