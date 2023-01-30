package ed.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);
        
        lista.adiciona("Paulo");
        System.out.println(lista);
        
        lista.adiciona(2, "Cecilia");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);
        
        lista.adiciona("Joao");
        lista.adiciona("Jose");
        
        System.out.println(lista);
        
        lista.remove(2);
        
        System.out.println(lista);
        
        System.out.println(lista.contem("Doulgas"));
        System.out.println(lista.contem("Cecilia"));
	
	}

}
