import java.util.Scanner;

public class AbrindoContas {
    public static class ContaBancaria {
        private int numero;
        private String titular;
        private double saldo;

        public ContaBancaria(int numero, String titular, double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }

        public int getNumero() {
            return numero;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            String nomeTitular = scanner.nextLine();
            double saldo = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

            System.out.println("Informacoes:");
            System.out.println("Conta: " + conta.getNumero());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: R$ " + conta.getSaldo());
        }
    }
}
