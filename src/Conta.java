
public abstract class Conta {
	protected double saldo; // Protected possibilita que as classes filhas possam acessar esse atributo
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public abstract void deposita(double valor);

	// Construtores

	public Conta(int agencia, int numero) {
		
		if (agencia<1) {
			throw new IllegalArgumentException ("Agência Inválida");
		}
		
		if (numero<1) {
			throw new IllegalArgumentException("Agência Inválida");
		}

//		if (agencia <= 0 || numero <= 0) {
//			System.out.println("Número inválido, valor não pode ser menor ou igual a 0!");
//			return;
//			
//			
//		}

		Conta.total++;

		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;

		System.out.println("Conta " + numero + " criada:");
		System.out.println("O total de contas atual é " + Conta.total);
	}

	//

	public void saca(double valor) throws SacaException {
		if (this.saldo < valor) {
			throw new SacaException("Saldo Insuficiente: " + this.saldo + " , Valor a sersacado: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SacaException {
		this.saca(valor);
		{
			destino.deposita(valor);
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
			System.out.println("Número de agência inválido, valor não pode ser menor ou igual a 0!"); // If só se aplica
																										// ao método
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
			System.out.println("Número de conta inválido, valor não pode ser menor ou igual a 0!");
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

	// No caso dos setters, que irão apenas settar, não é necessário colocar nenhum
	// tipo além do void.
}
