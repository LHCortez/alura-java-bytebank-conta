package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Usando o Generics<>:
		List<Conta> lista = new ArrayList<Conta>();
		
		List<Conta> vetor = new Vector<Conta>();
		
		List<Conta> link = new LinkedList<Conta>();

		// metodo .add adiciona objeto ao ArrayList
		Conta cc = new ContaCorrente(11, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 222);
		lista.add(cc2);

//		Cliente cliente = new Cliente ();
//		lista.add(cliente);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		// metodo .remove remove objeto do ArrayList
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 333);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(44, 444);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("----------");

		// enhanced for - modo mais elegante e utilizado de se realizar a iteração:

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}

	}
}
