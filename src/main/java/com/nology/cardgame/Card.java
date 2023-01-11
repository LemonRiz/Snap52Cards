package com.nology.cardgame;

public class Card {
    // Stores data for ONE card
    private String suit;
    private String symbol;
    private int value;

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" +
                suit +
                symbol + "(" + value + ")" +
                ']';
    }
}
