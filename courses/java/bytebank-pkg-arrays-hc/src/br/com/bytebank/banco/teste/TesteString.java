package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

	    String nome = "Mario"; //object literal
	    //String outro = new String("Alura"); má prática, sempre prefira a sintaxe literal
	    String outro = "Alura";
	    
	    String novo = outro.replace("A", "a");

	    System.out.println(novo);
	    
	    novo = nome.toLowerCase();
	    System.out.println(novo);
	    
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    int pos = nome.indexOf("rio");
	    System.out.println(pos);

	    String sub = nome.substring(1);
	    System.out.println(sub);
	    
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    }
	    
	    String vazio = "";
	    System.out.println(vazio.isEmpty());
	    outro = "  - Alura -   ";
	    System.out.println(outro.trim());
	    System.out.println(outro.contains("lu"));
	    
	    String splitted[] = new String[2];
	    splitted = outro.trim().split("u");
	    System.out.println(splitted[0]+"-"+splitted[1]);
	    
	    StringBuilder builder = new StringBuilder("Socorram");
	    builder.append("-");
	    builder.append("me");
	    builder.append(", ");
	    builder.append("subi ");
	    builder.append("no ");
	    builder.append("ônibus ");
	    builder.append("em ");
	    builder.append("Marrocos.");
	    String texto = builder.toString();
	    System.out.println(texto);
	    
	    nome = "ALURA";
	    CharSequence cs = new StringBuilder("al");

	    nome = nome.replace("AL", cs);

	    System.out.println(nome);
	    
	}

}
