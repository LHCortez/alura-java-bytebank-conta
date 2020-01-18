
public class TestaTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(2222, 1337);
		cc.deposita(1000.00);
		
		SeguroDeVida seg = new SeguroDeVida();

		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(seg);
		
		System.out.println(calc.getTotalImposto());

	}

}
