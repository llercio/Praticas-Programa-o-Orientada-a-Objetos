public class MainProduto {
    static void main() {
        Produto gabinete = new Produto();
        gabinete.setNome("Gabinete");
        gabinete.setPreco(150);

        gabinete.fichaProduto();
        gabinete.aplicarDesconto(20);
        System.out.println("Valor do produto com 20% de desconto: " + gabinete.getPreco());
    }
}
