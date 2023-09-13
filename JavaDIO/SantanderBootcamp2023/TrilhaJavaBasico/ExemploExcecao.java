import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Number value = NumberFormat.getInstance().parse("a1.76");
            System.out.println(value);
        } catch (ParseException e) {
            // Captura a exceção e imprime uma mensagem de erro
            System.out.println("Erro ao analisar o número: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
