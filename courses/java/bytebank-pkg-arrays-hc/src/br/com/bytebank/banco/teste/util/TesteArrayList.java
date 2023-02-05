package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		// generics, especifica o tipo de lista entre os "<>"
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cp1 = new ContaPoupanca(22, 22);
		lista.add(cp1);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		Conta cp2 = new ContaPoupanca(22, 44);
		lista.add(cp2);
		
		System.out.println("Tamanho: " + lista.size());
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		ArrayList<String> list = new ArrayList<String>(26); //capacidade inicial
		list.add("RJ");
		list.add("SP");
		//outros estados
		ArrayList<String> nova = new ArrayList<String>(list); //criando baseado na primeira lista
		System.out.println(list);
		System.out.println(nova);
	
	}

}
