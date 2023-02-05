package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);	
//		Conta cp1 = new ContaCorrente(22, 11);
//		
//		boolean igual = cc1.ehIgual(cp1);
//		System.out.println(igual);
		
		// generics, especifica o tipo de lista entre os "<>"
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cp1 = new ContaPoupanca(22, 22);
		lista.add(cp1);
		
		Conta cp2 = new ContaPoupanca(22, 22);
		boolean existe = lista.contains(cp2);
		System.out.println("Já existe? " + existe);
		
//		for (Conta conta : lista) {
//			if (conta.ehIgual(cp2)) {
//				System.out.println("Já tenho essa conta!");
//			}
//		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
