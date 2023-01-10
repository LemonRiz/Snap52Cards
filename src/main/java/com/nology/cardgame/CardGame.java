package com.nology.cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    // Stores and creates our deck of 52 cards
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    private final String[] suit = {"♢", "♤", "♡", "♧"};
    private final String[] symbol = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


    public CardGame(String name) {
        this.name = name;
    }

    public void createDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                deckOfCards.add(new Card(suit[i], symbol[j], value[j]));
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return deckOfCards;
    }

    public Card dealCard(){
        Card topCard = deckOfCards.get(deckOfCards.size()-1);
        deckOfCards.remove(deckOfCards.size()-1);
        return topCard;
    }

 public void sortCards(CardSorting cardSorting){
        switch (cardSorting){
            case byValue:
                deckOfCards.sort(new SortDeckInNumOrder());
                break;
            case bySuit:
                deckOfCards.sort(new SortDeckIntoSuits());
                break;
            case shuffle:
                Collections.shuffle(deckOfCards);
                break;
        }
        for (Card card : deckOfCards){
            System.out.println(card);
        }
 }



}
