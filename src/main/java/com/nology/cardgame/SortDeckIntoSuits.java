package com.nology.cardgame;

import java.util.Comparator;

public class SortDeckIntoSuits implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getSuit().compareTo(o2.getSuit());
    }
}
