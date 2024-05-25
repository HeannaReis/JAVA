package UltimaTransacao;

import java.util.Scanner;

public class UltimaTransacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String entrada = scanner.nextLine();
            Transacao transacao = criarTransacao(entrada);
            transacao.imprimir();
        } catch (EntradaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static Transacao criarTransacao(String entrada) throws EntradaInvalidaException {
        String[] partes = entrada.split(",");
        if (partes.length == 4) {
            DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];
            BigDecimal valor = new BigDecimal(partes[3]);

            LocalDate dataFormatada = LocalDate.parse(data, dataFormatter);
            LocalTime horaFormatada = LocalTime.parse(hora, horaFormatter);

            return new Transacao(dataFormatada, horaFormatada, descricao, valor);
        } else {
            throw new EntradaInvalidaException("Entrada invalida. Certifique-se de fornecer data, hora, descrição e valor separados por virgula.");
        }
    }
}

class Transacao {
    private LocalDate data;
    private LocalTime hora;
    private String descricao;
    private BigDecimal valor;

    public Transacao(LocalDate data, LocalTime hora, String descricao, BigDecimal valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(this.hora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.printf("%.2f%n", this.valor);
    }
}

class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
