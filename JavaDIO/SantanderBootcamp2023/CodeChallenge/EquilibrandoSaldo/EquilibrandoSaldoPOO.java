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

public class EquilibrandoSaldoPOO {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(saldoAtual);

            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);

            double valorRetirada = scanner.nextDouble();
            conta.retirar(valorRetirada);

            double saldoAtualizado = conta.getSaldo();

            System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtualizado);
        }
    }
}
