public class IdadePessoa {
    private String name;
    private int idade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(getName() + " é maior de idade.");
        } else {
            System.out.println(getName() + " é menor de idade.");
        }
    }
}
