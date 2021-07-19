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
public class PessoaJuridica extends Pessoa {
    private float faturamento;
    
    public PessoaJuridica(String razaosocial, String cnpj, String endereco, float faturamento){
        this.nome = nome;
        this.identificacao = cnpj;
        this.endereco = endereco;
        this.faturamento = faturamento;
    }
    
}
