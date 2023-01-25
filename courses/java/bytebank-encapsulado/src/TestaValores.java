
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 24226);
		Conta conta3 = new Conta(1337, 24226);
		
		System.out.println(Conta.getTotal());
		System.out.println(conta1.getTotal());
		System.out.println(conta2.getTotal());
		
	}
	
}
