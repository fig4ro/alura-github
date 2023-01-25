
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta01 = new Conta();
		conta01.saldo = 100;
		conta01.deposita(50);
		
		System.out.println(conta01.saldo);
		
		boolean sucesso = conta01.saca(20);
		System.out.println(conta01.saldo + " " + sucesso);
		
		Conta conta02 = new Conta();
		conta02.deposita(1000);
		
		sucesso = conta02.transfere(3030, conta01);
		if (sucesso)
		{
			System.out.println("transferencia com sucesso");
		}
		else
		{
			System.out.println("saldo insuficiente");
		}
		System.out.println(conta01.saldo);
		System.out.println(conta02.saldo);
		
		conta01.titular = "Paulo";

		
	}
	
}
