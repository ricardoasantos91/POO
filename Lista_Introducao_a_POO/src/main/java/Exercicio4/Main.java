/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        Casa casa = new Casa();
        
        casa.addPorta("Azul", 60, 50, 30, "Aberta");
        casa.addPorta("Verde", 90, 40, 20, "Aberta");
        casa.addPorta("Amarelo", 90, 40, 20, "Fechada");
        
        casa.portas[0].fecharPorta();
        casa.portas[1].fecharPorta();
        casa.portas[2].abrirPorta();
        
        casa.pintar("Azul");
        
        casa.pintar("Verde");
        casa.quantasPortasEstaoAbertas();
    }
}
