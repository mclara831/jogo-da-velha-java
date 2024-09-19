package boardGame;

import Exceptions.gameException;
import boardGame.game.Simbolos;

public class Board {
    
    private Campo[][] campos;
    private int linhas;
    private int colunas;

    public Board(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        campos = new Campo[linhas][colunas];
    }

    public Campo[][] getCampos() {
        return campos;
    }

    public void setCampos(Campo[][] campos) {
        this.campos = campos;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Simbolos access(int linha, int coluna) {
        if (linha <= getLinhas() || coluna <= getColunas()) {
            return campos[linha][coluna].getSimbolo();
        } else {
            throw new gameException("Linha e/ou colunas inválidos!");
        }
    }

    public void setSimbolo(Campo auxiliar){
        Campo campo = campos[auxiliar.getlinha()][auxiliar.getcoluna()];
        if (campo.getSimbolo() == null) {
            campo.setSimbolo(auxiliar.getSimbolo());
        } else {
            throw new gameException("Escolha outro campo!");
        }
    }
}
