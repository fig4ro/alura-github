// Administrador é um funcionario tbm, ele herda a class Funcionario(extends), assina o contrato Autenticavel

public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Administrador()
	{
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
