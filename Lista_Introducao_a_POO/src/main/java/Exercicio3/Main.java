/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        Porta porta = new Porta();
        
        porta.comprimento = 50;
        porta.largura = 30;
        porta.profundidade = 10;
        
        porta.cor = "Azul";
        
        porta.abrirPorta();
        
        porta.imprimirPorta();
        
        porta.comprimento = 60;
        porta.largura = 40;
        porta.profundidade = 10;
        
        porta.cor = "Verde";

        porta.fecharPorta();
        
        porta.imprimirPorta();
        
        porta.estaAberta();
        
    }
}
