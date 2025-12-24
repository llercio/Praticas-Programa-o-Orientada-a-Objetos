public class MainLivro {
    static void main() {
        Livro oSilmarilion = new Livro("O silmarilion", "J. R. R. Tolkien");
        Livro maus = new Livro("Maus", "Art Spiegelman");

        oSilmarilion.exibirDetalhes();
        System.out.println();
        maus.exibirDetalhes();
    }
}
