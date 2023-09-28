import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Reuniao1 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String dataInicialStr = scanner.nextLine();
        String dataFinalStr = scanner.nextLine();

        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        sistemaAcionistas.processarAnalisesDesempenho(dataInicialStr, dataFinalStr, System.out::println);

        scanner.close();
    }
}

class SistemaAcionistas {
    public void processarAnalisesDesempenho(String dataInicialStr, String dataFinalStr, Consumer<String> consumer) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        analises.stream()
            .filter(analise -> !analise.data.before(dataInicial) && !analise.data.after(dataFinal))
            .map(analise -> analise.descricao)
            .forEach(consumer);
    }
}

class Analise {
    Date data;
    String descricao;

    public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }
}
