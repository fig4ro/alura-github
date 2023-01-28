
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f)
	{
		double boni = f.getBonificacao();		// o metodo especifico será chamada para cada tipo
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}

}
