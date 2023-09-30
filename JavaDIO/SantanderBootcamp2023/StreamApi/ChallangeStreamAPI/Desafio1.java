package StreamApi.ChallangeStreamAPI;

public class Desafio1 {
    public static void main(String[] args) {
        ArrayNumeros arrayNumeros = new ArrayNumeros(); // Criar uma instância
        arrayNumeros.getNumeros().stream()
                .sorted() // Ordenar os números em ordem crescente
                .forEach(System.out::println);
    }
}
