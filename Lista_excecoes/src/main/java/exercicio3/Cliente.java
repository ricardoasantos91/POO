/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Sala
 */
public class Cliente {
    private String nome;
    private String CPF;
    
    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getCPF(){
        return this.CPF;
    }    

    public String getNome(){
        return this.nome;
    }        
}
