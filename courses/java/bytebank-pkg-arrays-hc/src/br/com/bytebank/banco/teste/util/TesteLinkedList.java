package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		// generics, especifica o tipo de lista entre os "<>"
		List<Conta> lista = new LinkedList<Conta>();
		
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
		
		LinkedList<String> list = new LinkedList<String>(); //capacidade inicial
		list.add("RJ");
		list.add("SP");
		//outros estados
		LinkedList<String> nova = new LinkedList<String>(list); //criando baseado na primeira lista
		System.out.println(list);
		System.out.println(nova);
	
	}

}
