package Observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteTest {
    @Test
    void notificarProdutoEsgotado() {
        Produto produto = new Produto("Produto 1", 2);

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        cliente1.escolherProduto(produto);
        cliente2.escolherProduto(produto);
        cliente3.escolherProduto(produto);

        cliente1.comprar(produto);
        cliente2.comprar(produto);
        assertEquals("Produto esgotado.", cliente3.situacaoProduto);
     }
}