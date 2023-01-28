
public class TesteReferencias {

	public static void main(String[] args) {
		
		// POLIMORFISMO - Gerente() pode ser tanto um funcionario quando um gerente
		// Funcionario g1 = new Gerente();
		Gerente g1 = new Gerente();
		g1.setNome("Vinicious");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
	}
	
}
