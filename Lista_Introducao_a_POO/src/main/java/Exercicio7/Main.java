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
public class Main {
    public static void main(String[] args){
        Supermercado supermercado = new Supermercado();
        
        supermercado.criarProduto("acucar",5.5f,5);
        supermercado.criarProduto("Chocolate",10f,5);
        supermercado.criarPedido("Ricardo","cartão");
        supermercado.pedidos[0].adicionarItem(supermercado.produtos,supermercado.numeroDeProdutos,"acucar",4);
        supermercado.pedidos[0].adicionarItem(supermercado.produtos,supermercado.numeroDeProdutos,"Chocolate",4);
        float valor = supermercado.pedidos[0].getTotalPedido();
        System.out.println("valor do pedido: " + valor);
        
    }
}
