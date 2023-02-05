package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cp1 = new ContaPoupanca(22, 44);
        Cliente clienteCP1 = new Cliente();
        clienteCP1.setNome("Guilherme");
        cp1.setTitular(clienteCP1);
        cp1.deposita(444.0);

        Conta cc2 = new ContaCorrente(22, 11);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Paulo");
        cc2.setTitular(clienteCC2);
        cc2.deposita(111.0);

        Conta cp2 = new ContaPoupanca(22, 22);
        Cliente clienteCP2 = new Cliente();
        clienteCP2.setNome("Ana");
        cp2.setTitular(clienteCP2);
        cp2.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cc2);
        lista.add(cp2);
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("---------------------------------------");
        //NumeroContaComparator comparator = new NumeroContaComparator();
        //TitularDaContaComparator titularComparator = new TitularDaContaComparator();
        //lista.sort(comparator);
        //lista.sort(titularComparator);
        //lista.sort(new TitularDaContaComparator());
        lista.sort(null);												// Ordem natural, definido na classe, ou seja, pelo saldo
        
        //Collections.sort(lista, new NumeroContaComparator());
        //Collections.sort(lista, new TitularDaContaComparator());
        //Collections.sort(lista);
        //Collections.reverse(lista);
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
        
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		String nomeO1 = o1.getTitular().getNome();
		String nomeO2 = o2.getTitular().getNome();
		
		return nomeO1.compareTo(nomeO2);
	}
	
}

class NumeroContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
//		return o1.getNumero() - o2.getNumero();
		
//		if(o1.getNumero() < o2.getNumero()) {
//			return -1;
//		}
//		if(o1.getNumero() > o2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}
	
}
