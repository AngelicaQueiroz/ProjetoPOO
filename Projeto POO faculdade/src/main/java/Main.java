import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação do estoque
        Estoque estoque = new Estoque();

        // Criação de produtos
        Produto produto1 = new Produto("Pão", 1, 50);
        Produto produto2 = new Produto("carne", 20, 6);
        Produto produto3 = new Produto("queijo", 38.9, 3);
        Produto produto4 = new Produto("bacon", 40.99, 2);

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);

        // Exibir produtos no estoque
        System.out.println("Produtos no estoque após adição:");
        produto1.imprimir();
        produto2.imprimir();
        produto3.imprimir();
        produto4.imprimir();

        // Buscar um produto no estoque
        String nomeBusca = "Pão";
        Produto produtoEncontrado = estoque.buscarProduto(nomeBusca);
        if (produtoEncontrado != null) {
            System.out.println("\nProduto encontrado: " + produtoEncontrado.getNome());
        } else {
            System.out.println("\nProduto '" + nomeBusca + "' não encontrado no estoque.");
        }

        // Remover um produto
        String nomeRemover = "queijo";
        estoque.removerProduto(nomeRemover);
        System.out.println("\nProdutos no estoque após remoção de '" + nomeRemover + "':");
        for (Produto produto : estoque.produtos) {
            produto.imprimir();
        }
    }
}
