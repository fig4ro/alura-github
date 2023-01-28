public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Cliente titular = new Cliente(); // inicializa um cliente na criacao de conta, neste caso nao e interessante
	private static int total; // atributo da classe e nao da instancia
	
	// Obriga na construcao da referencia com inicializacao
	public Conta(int agencia, int numero)
	{
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);

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
		if (this.saca(valor))
		{
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo()
	{
		return this.saldo;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public void setNumero(int numero)
	{
		if (numero <= 0)
		{
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0)
		{
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}