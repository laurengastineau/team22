package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Card implements Serializable {
    public final int value;
    public final Suit suit;
    public final String textRepresentation;

    public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") Suit suit) {
        this.value = value;
        this.suit = suit;
        this.textRepresentation = this.toString();
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        String cardValue = Integer.toString(this.value);

        if(this.value == 11)
            cardValue = "J";

        else if(this.value == 12)
            cardValue = "Q";

        else if(this.value == 13)
            cardValue = "K";

        else if(this.value == 14)
            cardValue = "A";

        return cardValue + " " + this.suit.toString();
    }
}
