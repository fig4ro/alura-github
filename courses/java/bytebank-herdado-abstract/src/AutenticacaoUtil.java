
public class AutenticacaoUtil {

	private int senha;
	
	public void setSenha(int senha) {
	}

	public boolean autentica(int senha) {
		if(this.senha == senha)
		{
			return true;
		}
		return false;
	}

}
