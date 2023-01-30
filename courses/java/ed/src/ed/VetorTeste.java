package ed;

public class VetorTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);

		System.out.println(lista);
		
		Aluno a3 = new Aluno("Christian");
		System.out.println(lista.contem(a3));
		
//		Aluno x = lista.pega(120);
//		System.out.println(x);
		
		lista.adiciona(1, a3);
		System.out.println(lista);
		
	}

}
