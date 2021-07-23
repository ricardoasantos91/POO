/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario;

/**
 *
 * @author ricar
 */
public abstract class Funcionario {
    
    protected float salarioBase;
    protected String nome;
    
    
    public String getNome(){
        return this.nome;
    }
    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public float getSalarioBase(){
        return this.salarioBase;
    }
    public abstract float calcularSalario();
}

