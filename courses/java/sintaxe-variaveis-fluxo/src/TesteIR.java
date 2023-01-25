
public class TesteIR {

	public static void main(String[] args) {
		
		
		double salario = 3300.0;
		double aliquota;
		int valor;
		
		if (salario >= 1900.0 && salario <= 2800.0)
		{
			aliquota = 7.5;
			valor = 142;
		}
		else if (salario > 2800.0 && salario <= 3751.0)
		{
			aliquota = 15.0;
			valor = 350;
		}
		else if (salario > 3751.0 && salario <= 4664.0)
		{
			aliquota = 22.5;
			valor = 636;
		}
		else
		{
			aliquota = 0;
			valor = 0;
		}
		
		System.out.println("aliquota: " + aliquota + "%\nvalor: " + valor);
		
	}
	
}
