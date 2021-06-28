/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

/**
 *
 * @author Sala
 */
public class Celular {
    Bateria bateria = new Bateria();
    
    void ligar(int segundos){
        int valor;
        valor = (int) segundos/5;
        bateria.nivel = bateria.nivel - valor;
        if (bateria.nivel < 0){
            bateria.nivel = 0;
            bateria.nivel = 0;
        }
    }
    
    void mensagem(){
        bateria.nivel = bateria.nivel - 1;
        if (bateria.nivel < 0){
            bateria.nivel = 0;
            bateria.nivel = 0;
        }
    }
    
    void checarNivelBateria(){
        float nivel;
        nivel = (float) bateria.nivel/bateria.carga*100;
        
        System.out.println("Nível de carga: " + bateria.nivel + "u ou " + nivel + "%");
    }
}
