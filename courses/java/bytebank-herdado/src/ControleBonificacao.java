
public class ControleBonificacao {

	private double soma;
	
//	public void registra(Gerente g)
//	{
//		double boni = g.getBonificacao();
//		this.soma += boni;
//	}
	// Exemplo da utilidade de polimorfismo, não é necessario um metodo para cada tipo de funcionario já que todos sao filhos de funcionario
	public void registra(Funcionario f)
	{
		double boni = f.getBonificacao();		// o metodo especifico será chamada para cada tipo
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}

}
