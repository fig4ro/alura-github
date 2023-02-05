package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias2 {
	public static void main(String[] args) {

        //int[] idades = new int[5];
        Object[] referencias = new Conta[5];
        System.out.println(referencias.length);
        
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;
        
//        Object refGenerica = contas[1];
//
//        System.out.println(refGenerica.getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}
}
