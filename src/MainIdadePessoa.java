public class MainIdadePessoa {
    static void main() {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(18);
        pessoa1.setName("vinisus");

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setIdade(15);
        pessoa2.setName("vinisas");

        System.out.println("Nome: " + pessoa1.getName() + "    Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();
        System.out.println(" ");
        System.out.println("Nome: " + pessoa2.getName() + "    Idade: " + pessoa2.getIdade());
        pessoa2.verificarIdade();
    }
}
