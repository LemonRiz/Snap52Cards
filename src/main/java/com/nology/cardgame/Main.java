package com.nology.cardgame;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("Snap");
        cardGame.createDeck();
        System.out.println(cardGame.getDeck().size());
    }
}