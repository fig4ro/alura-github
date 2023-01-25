public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	// Cliente titular = new Cliente(); // inicializa um cliente na criacao de conta, neste caso nao e interessante

	public void deposita(double valor)
	{
		this.saldo += valor;
	}

	public boolean saca(double valor)
	{
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino)
	{
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo()
	{
		return this.saldo;
	}

}