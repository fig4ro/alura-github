// Gerente é um funcionario tbm, ele herda a class Funcionario(extends), assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente()
	{
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao()
	{
		System.out.println("Gerente bonificacao");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
