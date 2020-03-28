package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Mario"; // object literal, boa pratica

		String outro = new String("Luigi"); // ma pratica

		String novo = outro.replace("L", "G");
		System.out.println(novo);

		String caps = nome.toUpperCase();
		System.out.println(caps);

		char c = nome.charAt(3); // char i
		System.out.println(c);

		int pos = nome.indexOf("rio");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

	}

}
