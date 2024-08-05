/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Lenovo
 */



/*
    Design pattern and principles used:

    CardFactory class is introduced to create Card objects.
    This is an implementation of the Factory Pattern, encapsulating the creation logic of cards.

*/

class CardFactory {
    
    public static Card createCard(Card.Rank rank, Card.Suit suit) {
        return new Card(rank, suit);
    }
}
