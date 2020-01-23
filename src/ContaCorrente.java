public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	//método que acrescenta R$ 0,50 no valor de cada saque
	@Override
	public void saca(double valor) throws SacaException {
		super.saca(valor +0.5);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
