import java.text.DecimalFormat;
import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double valor = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("0.00");

            String mensagem = (valor > 0)
                ? "Deposito realizado com sucesso!\nSaldo atual: R$ " + df.format(valor)
                : (valor == 0) ? "Encerrando o programa..." : "Valor invalido! Digite um valor maior que zero.";

            System.out.println(mensagem);
        }
    }
}
