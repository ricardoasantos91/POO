/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario.comissionado;

import empresa.funcionario.Funcionario;

/**
 *
 * @author ricar
 */
public class FuncionarioComissionado extends Funcionario{
    
    protected float vendas;
    protected float comissao;
    
    public FuncionarioComissionado(){
        
    }
    public FuncionarioComissionado(String nome, float vendas, float comissao){
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }
    
    @Override
    public float calcularSalario() {
        return this.vendas*this.comissao;
    }
    
}
