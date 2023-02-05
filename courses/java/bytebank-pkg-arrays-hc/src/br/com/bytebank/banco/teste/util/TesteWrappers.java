package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);		//autoboxing
		System.out.println(idadeRef.intValue());	// unboxing
	
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(29);
		refNumero = Double.valueOf(29.87);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getClass());
		}
		
		
	}

}
