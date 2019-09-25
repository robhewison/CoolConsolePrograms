package rwhewison;

import java.util.Random;
import java.util.Scanner;

public class RandomNameGen {
    /** [Not from daily programmer challenges the idea was entirely my own Created on 8-24-19 by Rob Hewison]
     * Description: Generates a randomly selected number of names with the choice of either boy, girl, or both
     * This is the first program I created when I first started getting serious about programming
     * This is a modified version of the original. If you'd like to see how it was first created go to programming folder
     * The file is Main.class in project Random Name Generator (can also be found on Github I think)
     * List of changes between original and this one will be written in COMPLETED: section under the to do
     *
     * TODO:
     *  Add more names for boys, girls, and last names [ongoing]
     *  Instead of asking "would you like to go again?" ask "would you like to exit?" (so y means go and n means exit)
     *  Allow ability to exclude Surnames
     *  Make certain aspects of program into their own methods if possible
     *  Once program is finalized change method to nameGenerator() from main(String[] args) method and add to Main
     *
     * CHANGES:
     *  Change lastNames to Surnames
     *  Removed unnecessary comments
     *  Changed exit selection from int to String
     *
     * FIXME:
     *
     *
     */
    static void namegen() {
        //Created the Array for Boy First Names
        String[] boyFirstNames = new String[]{"Rob", "Andrew", "James", "John", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven", "Kenneth",
                "Joshua", "George", "Kevin", "Brian", "Edward", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan", "Jacob", "Gary", "Nicholas", "Eric", "Stephen", "Jonathan", "Larry", "Justin", "Scott", "Brandon", "Frank",
                "Benjamin", "Gregory", "Samuel", "Raymond", "Patrick", "Alexander", "Jack", "Dennis", "Jerry", "Tyler", "Aaron", "Jose", "Henry", "Douglas", "Adam", "Peter", "Nathan", "Zachary", "Walter", "Kyle", "Harold",
                "Carl", "Jeremy", "Keith", "Roger", "Gerald", "Ethan", "Arthur", "Terry", "Travis", "Huey", "Briggs", "Bruno", "Hector", "Mario", "Atticus", "Cruz", "Garrett", "Cesar", "Zayn", "Odin", "Muhammad", "Conor", "Joaquin",
                "Caiden", "Dakota", "Major", "Keegan", "Sergio", "Marshall", "Johnny", "Kade", "Edgar", "Marco", "Tyson", "Nasir", "Kanye", "Adonis", "Rory", "Andy", "Malik", "Ari", "Gage", "Trevor", "Pedro", "Winston", "Matthias"};

        //Created the Array for Girl First Names
        String[] girlFirstNames = new String[]{"Tennison", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett",
                "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora", "Lily", "Eleanor", "Hannah", "Lillian", "Addison", "Aubrey", "Ellie", "Stella", "Natalie", "Zoe", "Leah", "Hazel",
                "Violet", "Aurora", "Savannah", "Audrey", "Brooklyn", "Bella", "Claire", "Skylar", "Lucy", "Paisley", "Everly", "Anna", "Caroline", "Nova", "Genesis", "Emilia", "Kennedy", "Samantha", "Maya", "Willow", "Kinsley", "Tessa", "Dakota",
                "Selena", "Lia", "Camille", "Malia", "Samara", "Raegan", "Ruth", "Olive", "Alexa", "Ivy", "Isla", "Autumn", "Eva", "Alice", "Ariana", "Jessica", "Logan", "Annie", "Sage", "Nina", "Arielle", "Raelyn", "Rylie", "Lexi", "Maci", "Margot",
                "Joy", "Cassidy", "Veronica", "Angel", "Heaven", "Kira", "Haley", "Alison", "Helen", "Kelsey", "Mikayla", "Blair", "Kyla", "Eve", "Kayleigh", "Sierra", "Chelsea", "Kara", "Holly", "Leslie", "Remy", "Macy", "Sasha", "Liberty"};

        //Created the Array for Last Names
        String[] Surnames = new String[]{"Hewison", "Smith", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark",
                "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts",
                "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox",
                "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Garrison"};

        int boyNameLength = boyFirstNames.length;
        int girlNameLength = girlFirstNames.length;
        int lastNameLength = Surnames.length;
        int boyOrGirlSelect;
        int nameCount;
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        // Add 1 to the result to get a number from the required range
        // (i.e., [1 - 100])
        int onOrOff = 1;
        System.out.println("RANDOM NAME GENERATOR");
        do{
            System.out.println("Enter (1) for boy names");
            System.out.println("Enter (2) for girl names");
            System.out.println("(both if none selected):");
            boyOrGirlSelect = reader.nextInt();
            System.out.println("How many names would you like to generate?");
            nameCount = reader.nextInt();
            //Generates multiple names
            for (int i = 0; i < nameCount; i++) {
                int n = rand.nextInt(boyNameLength);
                int n2 = rand.nextInt(girlNameLength);
                int n3 = rand.nextInt(lastNameLength);

                // Random generation if they don't choose boy or girl
                int oneOrTwo = rand.nextInt(2);
                oneOrTwo += 1;

                String boyFullName = boyFirstNames[n] + " " + Surnames[n3];
                String girlFullName = girlFirstNames[n2] + " " + Surnames[n3];

                //Decision tree
                if (boyOrGirlSelect == 1) {
                    System.out.println(boyFullName);
                }
                else if (boyOrGirlSelect == 2) {
                    System.out.println(girlFullName);
                }
                else {
                    if (oneOrTwo == 1) {
                        System.out.println(boyFullName);
                    }
                    else if (oneOrTwo == 2) {
                        System.out.println(girlFullName);
                    }
                    else {
                        System.out.println("error");
                    }
                }
            }
            //Asks user whether they would like to exit the program
            System.out.println("Would you like to exit program? (y/n)");
            reader.nextLine();
            String exitSelection = reader.nextLine();
            if (exitSelection.equals("Yes") || exitSelection.equals("yes") ||exitSelection.equals("Y") ||exitSelection.equals("y")) {
                onOrOff = 2;
                System.out.println("Goodbye");
            }
        }while (onOrOff == 1);

        /* <-- FOR DEVELOPMENT USE ONLY -->
         * Below is for development use and not for the user to see
         * USE ONE AT A TIME, it doesn't work otherwise (although it could be setup to check all at once)
         */

        // Check if there are any duplicates in the girlFirstNames Array
        for (int i = 0; i < girlNameLength; i++) {
            for (int j = i + 1; j < girlNameLength; j++) {
                if (girlFirstNames[i].equals(girlFirstNames[j])) {
                    System.out.println(girlFirstNames[i]);
                    System.out.println(i);
                    System.out.println(girlFirstNames[j]);
                    System.out.println(j);
                }
            }

        }

        /*
        //Check if there are any duplicates in the boyFirstNames Array
        for (int i = 0; i < boyNameLength; i++) {
            for (int j = i + 1; j < boyNameLength; j++) {
                if (boyFirstNames[i].equals(boyFirstNames[j])) {
                    System.out.println(boyFirstNames[i]);
                    System.out.println(i);
                    System.out.println(boyFirstNames[j]);
                    System.out.println(j);
                }
            }

        }
        //Check if there are any duplicates in the Surnames Array

        for (int i = 0; i < lastNameLength; i++) {
            for (int j = i + 1; j < lastNameLength; j++) {
                if (boyFirstNames[i].equals(Surnames[j])) {
                    System.out.println(Surnames[i]);
                    System.out.println(i);
                    System.out.println(Surnames[j]);
                    System.out.println(j);
                }
            }
        }

         */
    }
}
