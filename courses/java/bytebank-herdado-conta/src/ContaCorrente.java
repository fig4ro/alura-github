
// Construtor é especifico
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero)
	{
		// super();						// chamada do construtor da classe mae, padrao
		super(agencia, numero);
	}
	
	@Override							// sobrepoe o metodo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
