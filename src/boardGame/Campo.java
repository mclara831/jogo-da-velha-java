package boardGame;

import Exceptions.gameException;
import boardGame.game.Simbolos;

public class Campo {
    
    private int linha;
    private int coluna;
    private Simbolos simbolo;

    public Campo(){
    }

    public Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.simbolo = null;
    }

    public Simbolos getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolos simbolo) {
        if (this.simbolo == null) {
            this.simbolo = simbolo;
        } else {
            throw new gameException("Campo já utilizado, por favor, escolha outro campo!");
        }
    }

    public int getlinha() {
        return linha;
    }

    public void setlinha(int linha) {
        this.linha = linha;
    }

    public int getcoluna() {
        return coluna;
    }

    public void setcoluna(int coluna) {
        this.coluna = coluna;
    }
    
}
