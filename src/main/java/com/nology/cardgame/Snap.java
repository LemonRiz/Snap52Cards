package com.nology.cardgame;


public class Snap extends CardGame {
    public Snap(String name) {
        super("Snap");
    }

    boolean snapped = false;
    Commands commands = new Commands();

//    boolean player1 = true;
//    boolean player2 = false;

    private void doubleCheck() {
        if (commands.snapWin().equals("snap")) {
            snapped = true;
        } else {
            snapped = false;
        }
    }

    private void restartGame() {
        if (commands.playAgain().equals("y")) {
            System.out.println("Restarting...");
            snapStart();
        } else {
            snapped = true;
        }
    }

    public void snapStart() {
        snapped = false;
        createDeck();
        sortCards(CardSorting.byValue);
        System.out.println("Press Enter to deal your first card and start the game.");
        commands.getUserInput();
        Card card1 = dealCard();
        while (!snapped) {
            System.out.println("Press enter to deal another card.");
            commands.getUserInput();
            Card card2 = dealCard();
            if (card2.getSymbol().equals(card1.getSymbol())) {
                System.out.println("Press enter to deal another card.");
                doubleCheck();
                if (snapped) {
                    System.out.println(card1);
                    System.out.println(card2);
                    System.out.println("SNAP! You win!");
                    System.out.println("Play again? Y/N");
                    restartGame();
                }
            } else {
                card1 = card2;
            }

        }
    }


}
