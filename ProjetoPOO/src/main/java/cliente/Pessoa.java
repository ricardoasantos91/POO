/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author ricar
 */
public class Pessoa {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private String email;
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, String CPF, String endereco, String telefone, String email){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF (String CPF) throws CPFInvalidoException{
        String regex = "[0-9]+"; 
        boolean CPFcorreto = CPF.matches(regex);
        int digits = 0;
        if (CPFcorreto){
            for (int i = 0; i < CPF.length(); i++) {
            if (CPF.charAt(i) >= 48 && CPF.charAt(i) <= 57)
                digits++;
            }
        }else{
            throw new CPFInvalidoException("CPF invalido");
            
        }
        if (digits == 11){
            this.CPF = CPF;
        }else{
            throw new CPFInvalidoException("CPF invalido");
        }
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getEmail(){
        return this.email;
    }
    
}

