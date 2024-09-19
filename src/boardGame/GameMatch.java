package boardGame;

import game.Simbolos;

public class GameMatch {

    protected Board board;
    private Simbolos currentPlayer;
    private int turn;
    private boolean victory;
    private boolean endGame;

    public GameMatch() {
        this.board = new Board(3, 3);
        board.setCampos(createdABoard());
        this.currentPlayer = Simbolos.X;
        this.turn = 1;
    }

    public Simbolos getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Simbolos currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean getVictory() {
        return victory;
    }

    public void setVictory(boolean victory) {
        this.victory = victory;
    }
    
    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public Campo[][] createdABoard() {
        Campo[][] matriz = new Campo[board.getLinhas()][board.getColunas()];
        for (int i = 0; i < board.getLinhas(); i++) {
            for (int j = 0; j < board.getColunas(); j++) {
                matriz[i][j] = new Campo(i, j);
            }
        }
        return matriz;
    }

    public Board target(GameMatch gameMatch, String target) {

        String newPosition[] = new String[2];
        newPosition[0] = String.valueOf(target.charAt(0));
        newPosition[1] = String.valueOf(target.charAt(1));
        Campo campo = new Campo((Integer.parseInt(newPosition[0])) - 1, (Integer.parseInt(newPosition[1])) - 1);
        campo.setSimbolo(gameMatch.getCurrentPlayer());
        board.setSimbolo(campo);

        return board;
    }

    public Simbolos access(int linha, int coluna) {
        return board.access(linha, coluna);
    }

    public void nextTurn() {
        setCurrentPlayer((getCurrentPlayer() == Simbolos.X) ? Simbolos.O : (Simbolos.X));
        setTurn(getTurn() + 1);
    }

    public boolean checkVictory() {

        if (board.access(0, 0) == getCurrentPlayer() && 
            board.access(1, 1) == getCurrentPlayer() &&
            board.access(2, 2) == getCurrentPlayer()) 
        {
            return true;
            
        } else if (board.access(0, 2) == getCurrentPlayer() && 
                   board.access(1, 1) == getCurrentPlayer() &&
                   board.access(2, 0) == getCurrentPlayer()) 
        {
            return true;
        } 

        for (int i = 0; i < board.getLinhas(); i++) {
            if (board.access(i, 0) == getCurrentPlayer() && 
                board.access(i, 1) == getCurrentPlayer() &&
                board.access(i, 2) == getCurrentPlayer()) 
            {
                return true;
            } else if (board.access(0, i) == getCurrentPlayer() && 
            board.access(1, i) == getCurrentPlayer() &&
            board.access(2, i) == getCurrentPlayer()) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkEndGame() {
        for (int i = 0; i < board.getLinhas(); i++) {
            for (int j = 0; j < board.getColunas(); j++) {
                if (board.access(i, j) == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
