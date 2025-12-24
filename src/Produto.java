public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fichaProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}
