package JurosCompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = calcularValorFinal(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    static double calcularValorFinal(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return valorFinal;
    }
}
