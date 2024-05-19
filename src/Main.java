
public class Main {

	public static void main(String[] args) {
		Cliente mikael = new Cliente();
		mikael.setNome("Mikael");
		
		Conta cc = new ContaCorrente(mikael);
		Conta poupanca = new ContaPoupanca(mikael);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
