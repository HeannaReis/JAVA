import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ReuniaoAcionistas2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dataInicialStr = scanner.nextLine();
            String dataFinalStr = scanner.nextLine();

            SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
            sistemaAcionistas.obterAnalisesDesempenho(dataInicialStr, dataFinalStr, System.out::println);
        }
    }
}

class SistemaAcionistas {
    public void obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr, Consumer<String> resultHandler) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicial = LocalDate.parse(dataInicialStr, formatter);
        LocalDate dataFinal = LocalDate.parse(dataFinalStr, formatter);

        List<Analise> analises = criarAnalises();

        analises.stream()
                .filter(analise -> !analise.getData().isBefore(dataInicial) && !analise.getData().isAfter(dataFinal))
                .map(Analise::getDescricao)
                .forEach(resultHandler);
    }

    private List<Analise> criarAnalises() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(LocalDate.parse("01/01/2023", formatter), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(LocalDate.parse("15/02/2023", formatter), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(LocalDate.parse("31/03/2023", formatter), "Analises Corporativas"));
        analises.add(new Analise(LocalDate.parse("01/04/2023", formatter), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(LocalDate.parse("15/05/2023", formatter), "Analise de Ativos"));
        analises.add(new Analise(LocalDate.parse("30/06/2023", formatter), "Analise de Inovacao e Tecnologia"));
        return analises;
    }
}

class Analise {
    private LocalDate data;
    private String descricao;

    public Analise(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
