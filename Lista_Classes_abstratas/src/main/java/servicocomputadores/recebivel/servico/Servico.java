/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicocomputadores.recebivel.servico;

import servicocomputadores.recebivel.Recebivel;

/**
 *
 * @author ricar
 */
public class Servico implements Recebivel{
    
    private String descricao;
    private int horas;
    private double precoHora;
    
    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }
    
    public void imprimirItem(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Horas: " + this.horas);
        System.out.println("Preço hora: " + this.precoHora);
        System.out.println("Receita total: " + this.totalizarReceita());
    }
    
    @Override
    public double totalizarReceita() {
        double x;
        
        x = (double)this.horas*this.precoHora;
        return x;
        
    }
    
}
