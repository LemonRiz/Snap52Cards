package com.nology.cardgame;

import java.util.Scanner;

public class Commands {

    Scanner userInput = new Scanner(System.in);

    public String getUserInput() {
        String input = "";
        boolean loop = true;

        while (loop) {
            input = userInput.nextLine();

            if (!input.isEmpty()) {
                System.out.println("You only need to press enter.");
            } else {

                loop = false;
            }
        }
        return input;
    }
}
