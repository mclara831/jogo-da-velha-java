package application;

import boardGame.GameMatch;

public class UI {

    public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}	

    public static void printBoard(GameMatch gameMatch){
        for (int i = 0; i < gameMatch.getBoard().getLinhas(); i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < gameMatch.getBoard().getColunas(); j++) {
                if (gameMatch.access(i, j) == null) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" " + gameMatch.access(i, j) + " ");
                }
            }
            System.out.println();
        }

        System.out.println("   1  2  3");
    }

    public static void printMatch (GameMatch gameMatch) {
        System.out.println("Jogador atual: " + gameMatch.getCurrentPlayer());
        System.out.println("Rodada atual: " + gameMatch.getTurn());
    }    
}
