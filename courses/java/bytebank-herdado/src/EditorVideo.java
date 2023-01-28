// EditorVideo é um funcionario tbm, ele herda a class Funcionario(extends)

public class EditorVideo extends Funcionario {

	public double getBonificacao()
	{
		System.out.println("EditorVideo bonificacao");
		return super.getBonificacao() + 100;	// atributo definido em outra class entao se usa da classe mae, com super
	}														// ao atualizar o metodo mae é atualizado aqui tbm
	
}
