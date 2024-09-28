public class Produto {
    private int id;
    private String nome;
    private double preco;
    private float quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public float getQuantidade() {
        return quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    // Atualiza a quantidade de produto
    public void adicionarQuantidade(float quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirQuantidade(float quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque!");
        }
    }

    public void imprimir() {
        System.out.println("id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
    }
}

