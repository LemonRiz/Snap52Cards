package com.nology.cardgame;

import java.util.Scanner;


public class Commands {

    Scanner userInput = new Scanner(System.in);


    public String getUserInput() {
        String input = "";
        boolean loop = true;

        while (loop) {
            input = userInput.nextLine().toLowerCase();

            if (input.equals("snap")) {
                System.out.println("This isn't a match!");
            } else if
            (!input.isEmpty()) {
                System.out.println("You only need to press enter.");
            } else {

                loop = false;
            }
        }
        return input;
    }

    public String snapWin() {
        String input = "";
        boolean snapLoop = false;
        while (!snapLoop) {
            input = userInput.nextLine().toLowerCase();
            if (input.equals("snap")) {
                snapLoop = true;
            } else if (!input.isEmpty()) {
                System.out.println("You should have typed 'snap' to win!");
                return input;
            } else {
                System.out.println("You missed a snap!");
                return input;
            }
        }
        return input;
    }


    public String playAgain() {
        String input = "";
        input = userInput.nextLine().toLowerCase();
        if (input.equals("y")) {
            return "y";
        }
        return input;
    }
}
