package com.nology.cardgame;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("Snap");
        cardGame.createDeck();
        cardGame.sortCards(CardSorting.byValue);
        cardGame.sortCards(CardSorting.bySuit);
        cardGame.sortCards(CardSorting.shuffle);

    }
}