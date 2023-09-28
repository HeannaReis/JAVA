import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um
 * resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado
 * tipo.
 */

public class SupplierExemple {
    public static void main(String[] args) {
        // Usar Supplier com Expressão Lambda
        // Supplier<String> saudacao = () -> "Olá Seja Bem Vindo";

        List<String> listaSaudacao = Stream.generate(() -> "Olá Seja Bem Vindo")

                .limit(5)
                .collect(Collectors.toList());

        
        // List<String> listaSaudacao = Stream.generate(
        // new Supplier<String>() {
        // @Override
        // public String get() {
        // return "Olá Seja Bem Vindo";
        // }
        // }
        // )
        // .limit(5)
        // .collect(Collectors.toList());

        listaSaudacao.forEach(System.out::println);
    }

}
