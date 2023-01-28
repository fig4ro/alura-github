// EditorVideo é um funcionario tbm, ele herda a class Funcionario(extends)

public class EditorVideo extends Funcionario {

	public double getBonificacao()
	{
		System.out.println("EditorVideo bonificacao");
		return 150;	
	}
}
