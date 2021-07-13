package Observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    public String situacaoProduto;

    public void escolherProduto(Produto produto){
        produto.addObserver(this);
    }

    public void comprar(Produto produto){
         produto.unidadeVendida();
     }

    @Override
    public void update(Observable produto, Object arg) {
        Produto produtoCopy = (Produto) produto;
        this.situacaoProduto = produtoCopy.quantidade > 0 ? "Produto em estoque." : "Produto esgotado.";
    }
}
