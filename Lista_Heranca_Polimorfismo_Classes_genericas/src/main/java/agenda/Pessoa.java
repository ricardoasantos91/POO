/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Sala
 */
public class Pessoa {
    protected String endereco;
    protected String nome;
    protected String identificacao;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getIdentificacao(){
        return this.identificacao;
    }
}
