
public class TesteSaca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(888, 9999);

		c.deposita(200);

		try {
			c.saca(199);
		}

		catch (SacaException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}

		
		System.out.println("Saldo atual: " +c.getSaldo());
	}

}
