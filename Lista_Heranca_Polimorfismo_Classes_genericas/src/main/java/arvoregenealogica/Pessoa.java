/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

/**
 *
 * @author Sala
 */
public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa mae;
    private Pessoa pai;
    
    public Pessoa(String nome,int idade, Pessoa mae, Pessoa pai){
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }
    
    
}
