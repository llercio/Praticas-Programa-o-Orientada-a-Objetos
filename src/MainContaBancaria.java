public class MainContaBancaria {
    static void main() {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(123);
        conta1.setSaldo(3000);
        conta1.titular = "Contanildo";

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo em conta: " + conta1.getSaldo());
        System.out.println("Titular da conta: " + conta1.titular);

        conta1.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta1.getSaldo());
    }
}
