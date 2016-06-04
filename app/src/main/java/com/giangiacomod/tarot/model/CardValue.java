package com.giangiacomod.tarot.model;

public enum CardValue {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), KNIGHT(12), QUEEN(13), KING(14);

    public final int value;

    CardValue(int value) {
        this.value = value;
    }
}
