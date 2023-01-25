
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "123.123.123-12";
		paulo.profissao = "Programador";
		
		Conta conta01 = new Conta();
		conta01.deposita(100);
		
		conta01.titular = paulo;
		System.out.println(conta01.titular.nome);
		System.out.println(conta01.titular);
		System.out.println(paulo);
		
	}
	
}
