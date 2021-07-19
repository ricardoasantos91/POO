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
public class PessoaFisica extends Pessoa{
    protected String aniversario;
    
    public PessoaFisica(String nome, String cpf, String endereco, String aniversario){
        this.nome = nome;
        this.identificacao = cpf;
        this.endereco = endereco;
        this.aniversario = aniversario;
    }
}
