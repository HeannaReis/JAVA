import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        try (Scanner scanner = new Scanner(System.in)) {
            double valorInicial = scanner.nextDouble();
            double taxaJuros = scanner.nextDouble();
            int periodo = scanner.nextInt();

            double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

            System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        }
    }
}
