package Services;

import java.util.Scanner;
import Model.ContaCorrente;
import View.ContaCorrenteMensagem;

public class ContaBanco {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPor favor, digite o número da Número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nPor favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("\nPor favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("\nPor favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        ContaCorrente conta = new ContaCorrente(numero, agencia, nomeCliente, saldo);
        ContaCorrenteMensagem mensagemHelper = new ContaCorrenteMensagem();
        String mensagem = mensagemHelper.obterMensagem(conta);
        System.out.println(mensagem);

        scanner.close();
    }
}
