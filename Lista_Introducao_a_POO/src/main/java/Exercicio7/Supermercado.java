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
public class Supermercado {
    
    Pedido[] pedidos = new Pedido[100];
    int numeroDePedidos = 0;
    int numeroDeProdutos = 0;
    
    Produto[] produtos = new Produto[100];
    
    void criarProduto(String nome, float valor, int quantidade){
        Produto produto = new Produto();
        produto.nomeProduto = nome;
        produto.preco = valor;
        produto.quantidadeEmEstoque = quantidade;
        produtos[numeroDeProdutos] = produto;
        numeroDeProdutos++;
    }

    
    void criarPedido(String nomeDoCliente, String metodoDePagamento){
        Pedido pedido = new Pedido();
        pedido.cliente.nome = nomeDoCliente;
        pedido.metodo_de_pagamento = metodoDePagamento;
        pedidos[numeroDePedidos] = pedido;
        numeroDePedidos++;
    }
    

}