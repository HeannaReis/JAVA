public class App {
    public static void main(String[] args) throws Exception {
        Cliente heanna = new Cliente();
		heanna.setNome("Heanna");
		
		Conta cc = new ContaCorrente(heanna);
		Conta poupanca = new ContaPoupanca(heanna);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
