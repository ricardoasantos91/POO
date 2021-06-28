/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

/**
 *
 * @author Sala
 */
public class Item {
    Produto produto = new Produto();
    int quantidadeDesejada;
    
    
    float getTotalItem(){
        float valor_item;
        
        valor_item = (float) produto.getPrecoProduto()*quantidadeDesejada;
        
        return valor_item;
    }
}
