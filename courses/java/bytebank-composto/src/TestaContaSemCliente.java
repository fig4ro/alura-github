
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta conta01 = new Conta();
		System.out.println(conta01.getSaldo());
		
		conta01.titular = new Cliente();
		
		// Erro, titular e null
		conta01.titular.nome = "Marcela";
		System.out.println(conta01.titular.nome);
		
	}
	
}
