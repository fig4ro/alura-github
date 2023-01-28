// interface tem nada contreto, apenas abstract
// contrato Autenticavel
	// quem assinar o contrato, precisa implementar
		// metodo setSenha
		// metodo autentica
public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
