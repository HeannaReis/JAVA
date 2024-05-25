import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int saldoTotal = scanner.nextInt();
            int valorSaque = scanner.nextInt();

            String mensagem = (valorSaque <= saldoTotal)
                    ? "Saque realizado com sucesso. Novo saldo: " + (saldoTotal - valorSaque)
                    : "Saldo insuficiente. Saque não realizado!";

            System.out.println(mensagem);
        }
    }
}
