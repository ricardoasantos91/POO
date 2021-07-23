/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario.assalariado;
import empresa.funcionario.Funcionario;
/**
 *
 * @author ricar
 */
public class FuncionarioAssalariado extends Funcionario{
    
    public FuncionarioAssalariado(){
        
    }
    public FuncionarioAssalariado(String nome, float salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    @Override
    public float calcularSalario() {
        return salarioBase;
    }
    
    
}
