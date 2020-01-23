
public class TesteContas {

	public static void main(String[] args) throws SacaException {

		// OU:
		// Conta cc = new ContaCorrente
		// Conta cp = new ContaPoupanca

		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100);
		//cc.saca(10);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200);

		cc.transfere(80, cp);

		System.out.println("Saldos Atuais:");
		System.out.println("Conta Corrente: R$ " + cc.getSaldo());
		System.out.println("Conta Poupan�a: R$ " + cp.getSaldo());
	}

}
