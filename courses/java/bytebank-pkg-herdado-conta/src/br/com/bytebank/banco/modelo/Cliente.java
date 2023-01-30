package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Douglas Figueiró
 * @version 0.1
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    /**
     * Retorna nome do cliente
     * 
     * @return nome do cliente
     */
    public String getNome() {
        return nome;
    }
    /**
     * Seta nome do cliente
     * 
     * @param nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Retorna CPF do cliente
     * 
     * @return Retorna CPF
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * Seta o CPF do cliente
     * 
     * @param cpf do cliente
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * Retorna a profissao do cliente
     * 
     * @return profissao do cliente
     */
    public String getProfissao() {
        return profissao;
    }
    /**
     * Seta a profissao do cliente
     * 
     * @param profissao do cliente
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
    	return "Cliente: " + this.nome;
    }

}
