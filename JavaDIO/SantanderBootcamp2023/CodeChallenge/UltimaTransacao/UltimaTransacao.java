package UltimaTransacao;

import java.util.Scanner;

public class UltimaTransacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String entrada = scanner.nextLine();
            Transacao transacao = Transacao.criarTransacao(entrada);
            transacao.imprimir();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    private Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static Transacao criarTransacao(String entrada) {
        String[] partes = entrada.split(",");
        if (partes.length == 4) {
            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];
            double valor = Double.parseDouble(partes[3]);
            return new Transacao(data, hora, descricao, valor);
        } else {
            throw new IllegalArgumentException("Entrada inválida. Certifique-se de fornecer data, hora, descrição e valor separados por vírgula.");
        }
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f%n", this.valor);
    }
}
