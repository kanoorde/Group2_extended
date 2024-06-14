/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private GroupOfCards groupofcards;
    private List<Card> foundation;
    private List<Card> wastePile;
    private List<List<Card>> tableau;

    public Game() {
        foundation = new ArrayList<>();
        wastePile = new ArrayList<>();
        tableau = new ArrayList<>();
        dealTableau();
    }

    public abstract void dealTableau();

    public abstract void drawCard();

    public abstract boolean moveCardToFoundation(); 

    public abstract boolean checkWin();

    public abstract boolean checkLoss();

    public abstract boolean hasMovesLeft();

    public abstract void printGameState();
}
