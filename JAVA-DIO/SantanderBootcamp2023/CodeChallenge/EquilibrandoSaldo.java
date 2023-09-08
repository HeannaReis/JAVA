import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito - valorRetirada;

        // Imprime o saldo atualizado com uma casa decimal
        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
        scanner.close();
    }
}
