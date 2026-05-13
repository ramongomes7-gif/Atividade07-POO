public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void exibirDados() {
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("------------------------");
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("\nPreço atualizado com sucesso!");
    }
}
