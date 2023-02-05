package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		Object cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(123, 111);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cliente);
		
	}

}
