// abstract identifica a class somente para funcionalidade de heranca, nao sendo possivel criar uma instancia dela
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected double salario; // protected libera o uso para filhos

	public abstract double getBonificacao();				// quem implementa este metodo sao os filhos, abstract obriga os filhos a isto
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
