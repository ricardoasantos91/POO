/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario.comissionadosalariobase;

import empresa.funcionario.Funcionario;
import empresa.funcionario.comissionado.FuncionarioComissionado;

/**
 *
 * @author ricar
 */
public class FuncionarioComissionadoSalarioBase extends FuncionarioComissionado {
    
    public FuncionarioComissionadoSalarioBase(String nome, float vendas, float salarioBase, float comissao){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.comissao = comissao;
    }
    
    @Override
    public float calcularSalario() {
        return salarioBase + this.vendas*this.comissao;
    }
    
}
