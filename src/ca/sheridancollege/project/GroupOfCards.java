/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 *

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/*
    Design Pattern and Principle used:

    GroupOfCards class manages a collection of cards (deck).
    Follows Single Responsibility Principle and uses the Factory pattern to create Card instances.
*/


public class GroupOfCards {
    private final List<Card> cards;

    
    // This is a constructor which initializes the arraylist of cards.
    public GroupOfCards() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    
    // This method is used to initialize deck of cards
    private void initializeDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(CardFactory.createCard(rank, suit));
            }
        }
    }

    
    // This method shuffles the deck of card
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    
    // this method is used draw cards
    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public int size() {
        return cards.size();
    }
}