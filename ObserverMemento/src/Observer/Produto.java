package Observer;

import java.util.Observable;

public class Produto extends Observable {
    public String nome;
    public Integer quantidade;

    public void unidadeVendida(){
        if(this.quantidade > 0) {
            this.quantidade -= 1;
            setChanged();
            notifyObservers();
        }
    }

    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
