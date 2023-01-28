// Gerente é um funcionario tbm, ele herda a class Funcionario(extends)

public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha)
	{
		if(this.senha == senha)
		{
			return true;
		}
		return false;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao()
	{
		System.out.println("Gerente bonificacao");
		return super.getBonificacao() + super.getSalario();	// atributo definido em outra class entao se usa da classe mae, com super
	}														// ao atualizar o metodo mae é atualizado aqui tbm
	
}
