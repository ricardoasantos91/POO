/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario.recebeporhora;

import empresa.funcionario.Funcionario;

/**
 *
 * @author ricar
 */
public class FuncionarioHoraExtra extends Funcionario{
    
    float horasTrabalhadas;
    
    public FuncionarioHoraExtra(String nome, float horasTrabalhadas, float salarioBase){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBase = salarioBase;
    }
    
    @Override
    public float calcularSalario() {
        if (horasTrabalhadas > 40){
            return (salarioBase + salarioBase/40*(horasTrabalhadas - 40));
        }else{
            return(salarioBase);
        }
    }
    
}
