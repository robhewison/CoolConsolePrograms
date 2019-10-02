package coolconsoleprograms;

import java.util.Scanner;

class AnimalStore {
    /* [Not a daily programmer challenges created on my own first program of Cool Programs project]
     * Description: Program asks user for animal name and checks if that animal is available in the store
     * If the animal is in the store then the user is asked if they want to buy it
     * If the user wants to buy it program ends but if user says no it asks it they want to look more
     * If the user wants to keeping looking it goes back to availability lookup
     * Program also check if user doesn't enter "yes" or "no" and repeats question
     *
     * Challenges:
     * I was having a lot of trouble with the return method for animalBought
     * I tried using a boolean for loops but couldn't figure it out so switched to int 0 or 1
     * I wonder if there's a way to use 'animalBought' in method instead of needing to make 'animalGot'
     *
     * TODO:
     *  Use boolean for loops
     *  Add more animals
     *
     * FIXME:
     *  Use animalBought in method instead of needing to make the animalGot method
     *
     */
    static void animalStore() {
        Scanner reader = new Scanner(System.in);
        String userAnimal;
        int animalBought = 0;
        System.out.println("ANIMAL STORE");
        System.out.println("You're at the pet store trying to buy a pet (type 'quit' to end)");
        do {
            System.out.println("Enter animal name to check availability:");
            userAnimal = reader.nextLine();
            switch (userAnimal) {
                case "Dog":
                case "dog":
                    System.out.println("We've got one!");
                    System.out.println("woof woof");
                    animalBought = askToBuy();
                    break;
                case "Cat":
                case "cat":
                    System.out.println("We've got one!");
                    System.out.println("meow meow");
                    animalBought = askToBuy();
                    break;
                case "Lizard":
                case "lizard":
                    System.out.println("We've got one!");
                    System.out.println("*lizard sounds*");
                    animalBought = askToBuy();
                    break;
                case "Spider":
                case "spider":
                case "Tarantula":
                case "tarantula":
                    System.out.println("We've got one!");
                    System.out.println("It bites your hand");
                    animalBought = askToBuy();
                    break;
                case "Frog":
                case "frog":
                    System.out.println("We've got one!");
                    System.out.println("ribbit ribbit");
                    animalBought = askToBuy();
                    break;
                case "Cow":
                case "cow":
                    System.out.println("We've got one!");
                    System.out.println("moo moo");
                    animalBought = askToBuy();
                    break;
                case "Duck":
                case "duck":
                    System.out.println("We've got one!");
                    System.out.println("quack quack");
                    animalBought = askToBuy();
                    break;
                case "Bird":
                case "bird":
                    System.out.println("We've got one!");
                    System.out.println("chirp chirp");
                    animalBought = askToBuy();
                    break;
                case "Pig":
                case "pig":
                    System.out.println("We've got one!");
                    System.out.println("oink oink");
                    animalBought = askToBuy();
                    break;
                case "Exit":
                case "exit":
                case "End":
                case "end":
                case "Quit":
                case "quit":
                    System.out.println("Have a nice day!");
                    animalBought = 1;
                    break;
                default:
                    System.out.println("I don't think we have that animal, sorry!");
                    break;
            }
        } while (animalBought == 0);
    }
    //Method below goes through the process of asking the user if they wan't to buy the animal selected
    private static int askToBuy() {
        String userChoice;
        int ynError;
        int animalGot = 0;
        do {
            System.out.println("Would you like to buy it? (y/n)");
            Scanner reader = new Scanner(System.in);
            userChoice = reader.nextLine();
            if (userChoice.equals("Y") || userChoice.equals("y") || userChoice.equals("Yes") || userChoice.equals("yes")) {
                System.out.println("Enjoy your animal!");
                animalGot = 1;
                return animalGot;
            }
            else if (userChoice.equals("N") || userChoice.equals("n") || userChoice.equals("No") || userChoice.equals("no")) {
                do {
                    System.out.println("Aww man! Would you like to keep looking? (y/n)");
                    userChoice = reader.nextLine();
                    if (userChoice.equals("Y") || userChoice.equals("y") || userChoice.equals("Yes") || userChoice.equals("yes")) {
                        return animalGot;
                    }
                    else if (userChoice.equals("N") || userChoice.equals("n") || userChoice.equals("No") || userChoice.equals("no")) {
                        System.out.println("Have a nice day!");
                        animalGot = 1;
                        return animalGot;
                    }
                    else {
                        System.out.println("What? Not a valid response");
                        ynError = 1;
                    }
                }while (ynError == 1);
            }
            else {
                System.out.println("What? Not a valid response");
                ynError = 1;
                //I was putting 'return animalGot' here instead of right outside loop
            }
        }while (ynError == 1);
        return animalGot;
    }
}
