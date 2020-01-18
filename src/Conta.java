
public abstract class Conta {
	protected double saldo; // Protected possibilita que as classes filhas possam acessar esse atributo
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public abstract void deposita(double valor);

	// Construtores

	public Conta(int agencia, int numero) {

		if (agencia <= 0 || numero <= 0) {
			System.out.println("N�mero inv�lido, valor n�o pode ser menor ou igual a 0!");
			return;
		}

		Conta.total++;

		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;

		System.out.println("Conta " + numero + " criada:");
		System.out.println("O total de contas atual � " + Conta.total);
	}

	//

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;

		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�mero de ag�ncia inv�lido, valor n�o pode ser menor ou igual a 0!"); // If s� se aplica
																										// ao m�todo
																										// setXxx.
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�mero de conta inv�lido, valor n�o pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	// No caso dos setters, que ir�o apenas settar, n�o � necess�rio colocar nenhum
	// tipo al�m do void.
}
