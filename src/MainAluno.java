public class MainAluno {
    static void main() {
        Aluno aprovildo = new Aluno("Aprovildo", 10, 9, 9.5);
        Aluno reprovildo = new Aluno("Reprovildo", 5, 3, 7.5);

        System.out.println("nome do aluno: " + aprovildo.getNome());
        System.out.println("Nota 1: " + aprovildo.getNota1());
        System.out.println("Nota 2: " + aprovildo.getNota2());
        System.out.println("Nota 3: " + aprovildo.getNota3());
        System.out.println("Média: " + aprovildo.calcularMedia());
        System.out.println("------------------------------------");

        System.out.println("nome do aluno: " + reprovildo.getNome());
        System.out.println("Nota 1: " + reprovildo.getNota1());
        System.out.println("Nota 2: " + reprovildo.getNota2());
        System.out.println("Nota 3: " + reprovildo.getNota3());
        System.out.println("Média: " + reprovildo.calcularMedia());
    }
}
