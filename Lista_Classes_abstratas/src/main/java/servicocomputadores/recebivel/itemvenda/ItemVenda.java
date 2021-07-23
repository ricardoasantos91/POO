/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicocomputadores.recebivel.itemvenda;
import servicocomputadores.recebivel.Recebivel;
/**
 *
 * @author ricar
 */
public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    public void imprimirItem(){
        System.out.println("Item: " + this.produto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço Unitário: " + this.precoUnitario);
        System.out.println("Receita total: " + this.totalizarReceita());
    }
    @Override
    public double totalizarReceita() {
        double x;
        
        x = (double)this.quantidade*this.precoUnitario;
        
        return x;
    }
    
}
