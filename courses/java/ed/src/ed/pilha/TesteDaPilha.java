package ed.pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {

//		Pilha pilha = new Pilha();
//		
//		pilha.push("Mauricio");
//		System.out.println(pilha);
//
//		pilha.push("Diogo");
//		System.out.println(pilha);
//		
//		String r1 = pilha.pop();
//		System.out.println(r1);
//		
//		String r2 = pilha.pop();
//		System.out.println(r2);
//		
//		System.out.println(pilha.vazia());
//		pilha.push("Diego");
//		System.out.println(pilha.vazia());
//		
//		System.out.println(pilha);

		// push(empurra): adiciona um item na pilha, ultimo
		// pop: deleta o ultimo item da pilha
		// peek: informa o ultimo item da pilha
		
		Stack<String> stack = new Stack<String>();
		stack.push("Marcelo");
		stack.push("Murillo");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		String nome = stack.peek();
		System.out.println(nome);
		
		System.out.println(stack);
		
	}

}
