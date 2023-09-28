import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ReuniaoAcionistas {

    public static void main(String[] args) throws ParseException {
        try (Scanner scanner = new Scanner(System.in)) {
            String dataInicialStr = scanner.nextLine();
            String dataFinalStr = scanner.nextLine();

            SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
            sistemaAcionistas.inicializarAnalises();
            sistemaAcionistas.processarAnalisesDesempenho(dataInicialStr, dataFinalStr, System.out::println);
        }
    }
}

class SistemaAcionistas {
    private final List<Analise> analises = new ArrayList<>();

    public void inicializarAnalises() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
            analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
            analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
            analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
            analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
            analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao inicializar as análises: " + e.getMessage(), e);
        }
    }

    public void processarAnalisesDesempenho(String dataInicialStr, String dataFinalStr, Consumer<String> consumer) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        analises.stream()
            .filter(analise -> !analise.getData().before(dataInicial) && !analise.getData().after(dataFinal))
            .map(Analise::getDescricao)
            .forEach(consumer);
    }
}

class Analise {
    private final Date data;
    private final String descricao;

    public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
