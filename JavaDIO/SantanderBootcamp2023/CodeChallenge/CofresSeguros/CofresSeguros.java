package CofresSeguros;

import java.util.Scanner;

abstract class Cofre {
    private final String tipo;
    private final String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMetodoAbertura() {
        return metodoAbertura;
    }

    public abstract boolean abrir(int tentativaSenha);
}

class CofreDigital extends Cofre {
    private final int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    @Override
    public boolean abrir(int tentativaSenha) {
        return senha == tentativaSenha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    @Override
    public boolean abrir(int tentativaSenha) {
        // Cofre físico não possui senha, então não pode ser aberto assim
        return false;
    }
}

public class CofresSeguros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String tipoCofre = scanner.nextLine().toLowerCase();
            Cofre cofre;

            if (tipoCofre.equals("digital")) {
                int senha = Integer.parseInt(scanner.nextLine());
                cofre = new CofreDigital(senha);
            } else if (tipoCofre.equals("fisico")) {
                cofre = new CofreFisico();
            } else {
                System.out.println("Tipo de cofre invalido!");
                return;
            }

            System.out.println("Tipo: " + cofre.getTipo());
            System.out.println("Metodo de abertura: " + cofre.getMetodoAbertura());

            if (tipoCofre.equals("digital")) {
                int tentativaSenha = Integer.parseInt(scanner.nextLine());

                if (cofre.abrir(tentativaSenha)) {
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            }
        }
    }
}

