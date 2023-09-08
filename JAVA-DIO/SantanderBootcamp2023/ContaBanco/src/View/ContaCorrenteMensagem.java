package View;
import Model.ContaCorrente;

public class ContaCorrenteMensagem {
    public String obterMensagem(ContaCorrente conta) {
        return "\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " +
                String.format("%.2f", conta.getSaldo()) + " já está disponível para saque.";
    }
}