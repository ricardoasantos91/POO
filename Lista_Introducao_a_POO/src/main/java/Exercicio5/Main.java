/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        Televisao televisao = new Televisao();
        
        televisao.ligarOuDesligar();
        televisao.imprimirTelevisao();
        
        televisao.alterarCanal(50);
        
        televisao.imprimirTelevisao();
        
        televisao.aumentarCanal();
        televisao.imprimirTelevisao();
        televisao.aumentarCanal();
        televisao.imprimirTelevisao();
        televisao.diminuirCanal();
        televisao.imprimirTelevisao();
        
        televisao.aumentarVolume();
        
        televisao.imprimirTelevisao();
        
        televisao.diminuirVolume();
        televisao.imprimirTelevisao();
        
        televisao.silenciar();
        televisao.imprimirTelevisao();
        
        televisao.silenciar();
        televisao.imprimirTelevisao();
        
        
        
        
    }
}
