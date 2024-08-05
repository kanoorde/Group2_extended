/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.Scanner;



/*
    Design patterns and principle:

    Player class to handle user input and game interaction.
    It follows the Single Responsibility Principle by only managing Input/Ouput and game interaction logic.
*/



// This is a player class and it has the main method
public class Player {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.printGameState();
            System.out.println("Choose action: 1 - Draw Card, 2 - Move Card to Foundation, " +
                               "3 - Move to Pile From Waste Pile, 4 - Move Card From Pile To Pile, 5 - Quit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game.drawCard();
                    break;
                case 2:
                    if (!game.moveCardToFoundation()) {
                        System.out.println("No card to move to foundation.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Tableau pile number to move to:");
                    int tableauPile = scanner.nextInt();
                    if (!game.moveCardToPile(tableauPile - 1)) {
                        System.out.println("Invalid move.");
                    }
                    break;
                case 4:
                    System.out.println("Enter source Tableau pile number:");
                    int fromPile = scanner.nextInt();
                    System.out.println("Enter destination Tableau pile number:");
                    int toPile = scanner.nextInt();
                    if (!game.moveCardBetweenPiles(fromPile - 1, toPile - 1)) {
                        System.out.println("Invalid move or no card to move.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting game.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (game.checkWin()) {
                System.out.println("Congratulations! You've won the game.");
                break;
            }

            if (game.checkLoss()) {
                System.out.println("No moves left. You've lost the game.");
                break;
            }
        }

        scanner.close();
    }
}
