package com.nology.cardgame;


public class Snap extends CardGame {
    public Snap(String name) {
        super("Snap");
    }

    private boolean snapped = false;
    Commands commands = new Commands();

    public void snapStart() {
        createDeck();
        sortCards(CardSorting.shuffle);
        System.out.println("Press Enter to start game");
        commands.getUserInput();
        Card card1 = dealCard();
        while (!snapped) {
            System.out.println("Press enter to deal another card.");
            commands.getUserInput();
            Card card2 = dealCard();
            if (card2.getSymbol().equals(card1.getSymbol())) {
                commands.snapWin();
                snapped = true;
                System.out.println(card1);
                System.out.println(card2);
                System.out.println("SNAP! You win!");
            } else {
                card1 = card2;
            }

        }
    }

}
