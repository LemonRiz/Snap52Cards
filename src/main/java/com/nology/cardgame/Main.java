package com.nology.cardgame;


public class Main {
    public static void main(String[] args) {

        CardGame cardGame = new CardGame("Snap");
        Snap snap = new Snap("snap");

        cardGame.createDeck();
        cardGame.sortCards(CardSorting.bySuit);
        System.out.println(cardGame.getDeck());

        System.out.println();
        snap.snapStart();


    }


}