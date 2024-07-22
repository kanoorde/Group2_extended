/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */


// The public class name card is created which represents the playing cards with specific rank and suits.
public class Card {
    
    //These fields store the rank and suit of the card and is declared final because they are immutable 
    // once set to constructor.
    private final Rank rank;
    private final Suit suit;

    
    //This is a constructor for card class and it initialises the rank and suit.
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    
    //these are two getters of the card class and it returns the rank and suit of the card.
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    
    // this method provide string representation of the card in format rank of suits.
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    
    // these enums are used to describe the possible ranks and suits of the card.
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
}
