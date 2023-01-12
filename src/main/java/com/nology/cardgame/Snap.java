package com.nology.cardgame;


public class Snap extends CardGame {
    public Snap(String name) {
        super("Snap");
    }

    private boolean snapped = false;
    Commands commands = new Commands();

    private String SnapWin() {
        if (commands.snapWin().equals("snap")) {
            snapped = true;
        } else {
            snapped = false;
        }
        return null;
    }

    public void snapStart() {
        createDeck();
        sortCards(CardSorting.shuffle);
        System.out.println("Press Enter to deal your first card and start the game.");
        commands.getUserInput();
        Card card1 = dealCard();
        while (!snapped) {
            System.out.println("Press enter to deal another card.");
            commands.getUserInput();
            Card card2 = dealCard();
            if (card2.getSymbol().equals(card1.getSymbol())) {
                System.out.println("Press enter to deal another card.");
                SnapWin();
                System.out.println(card1);
                System.out.println(card2);
                System.out.println("SNAP! You win!");
            } else {
                card1 = card2;
            }

        }
    }

}
