
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario douglas = new Funcionario();
		
		douglas.setNome("Douglas Figueiró");
		douglas.setCpf("123123123-12");
		douglas.setSalario(2500.00);
		
		System.out.println(douglas.getNome());
		System.out.println(douglas.getBonificacao());
		
		

	}

}
