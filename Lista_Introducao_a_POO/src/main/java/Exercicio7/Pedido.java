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
public class Pedido{
    String metodo_de_pagamento;
    
    Cliente cliente = new Cliente();
    Item[] itens = new Item[100];
    int numeroDeItens = 0;
    
    
    float getTotalPedido(){
        float valor_pedido;
        valor_pedido = 0;
        for(int i = 0; i < numeroDeItens;i++){
            valor_pedido = (float) valor_pedido + itens[i].getTotalItem();
        }
        return valor_pedido;
    }
    
    
    void adicionarItem(Produto[] produtos, int numeroDeProdutos, String nomedoProduto, int quantidade){
        Item item = new Item();
        for(int i = 0; i < numeroDeProdutos;i++){
            if (produtos[i].nomeProduto == nomedoProduto){
                item.produto = produtos[i];
            }
        }
        item.quantidadeDesejada = quantidade;
        itens[numeroDeItens] = item;
        numeroDeItens++;

    }

    
    
    
    
}
