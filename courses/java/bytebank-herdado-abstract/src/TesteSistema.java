
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(123123);
		
		Administrador adm = new Administrador();
		adm.setSenha(321321);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);

	}

}
