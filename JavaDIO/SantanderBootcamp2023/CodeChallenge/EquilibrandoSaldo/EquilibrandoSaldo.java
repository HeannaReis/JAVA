import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }
}

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();
            ContaBancaria conta = new ContaBancaria(saldoAtual);

            conta.depositar(scanner.nextDouble());
            conta.retirar(scanner.nextDouble());

            System.out.printf("Saldo atualizado na conta: %.1f%n", conta.getSaldo());
        }
    }
}
