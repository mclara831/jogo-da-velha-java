package aplication;

import java.util.Scanner;

import Exceptions.gameException;
import boardGame.GameMatch;

public class Program {
    public static void main(String[] args) {

        GameMatch gameMatch = new GameMatch();
        Scanner sc = new Scanner(System.in);

        while (!gameMatch.getVictory() && !gameMatch.isEndGame()) {

            try {
                UI.clearScreen();
                UI.printBoard(gameMatch);
                UI.printMatch(gameMatch);

                System.out.print("Campo destinado: ");
                String target = sc.nextLine();
                sc.nextLine();

                gameMatch.target(gameMatch, target);

                gameMatch.setVictory(gameMatch.checkVictory());
                gameMatch.setEndGame(gameMatch.checkEndGame());
    
                
                if (gameMatch.getVictory()) {
                    UI.printBoard(gameMatch);
                    System.out.println("O ganhador da partida e: " + gameMatch.getCurrentPlayer());
                } else if (gameMatch.isEndGame()) {
                    UI.printBoard(gameMatch);
                    System.out.println("Ninguém ganhou! Deu velha!");
                }

                gameMatch.nextTurn();

            } catch (gameException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } 
        }

        sc.close();
    }
}
