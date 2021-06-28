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
public class Televisao {
    String estado = "Desligado";
    int volume = 5;
    int canal = 0;
    String modo = "Som";
    
    void imprimirTelevisao(){
        System.out.println("Atributos atuais da TV: ");
        System.out.println("Situação: " + estado);
        System.out.println("Volume: " + volume);
        System.out.println("canal: " + canal);        
        System.out.println("Modo: " + modo);
    }
    
    void ligarOuDesligar(){
        if (estado == "Ligado"){
            estado = "Desligado";
            System.out.println("A TV foi desligada");
        }else{
            estado = "Ligado";
            System.out.println("A TV foi ligada");
        }
    }
    
    void aumentarVolume(){
        if (volume < 10){
            volume++;
        }
        
    }
    
    void diminuirVolume(){
        if (volume > 0){
            volume--;
        }
    }
    
    void aumentarCanal(){
        if (estado == "Desligado"){
            System.out.println("A TV está desligada, precisa ser ligada primeiro");
        }else{
            if (canal < 99){
                canal++;     
            }
        }         
    }
    
    void diminuirCanal(){
        if (estado == "Desligado"){
            System.out.println("A TV está desligada, precisa ser ligada primeiro");
        }else{
            if (canal > 0){
                canal--;     
            }
        }         
    }
    
    void alterarCanal(int novoCanal){
        if (estado == "Desligado"){
            System.out.println("A TV está desligada, precisa ser ligada primeiro");
        }else{
            if (novoCanal >= 0 && novoCanal <= 99){
                canal = novoCanal;     
            }
        }         
    }    
    void silenciar(){
        if (estado == "Desligado"){
            System.out.println("A TV está desligada, precisa ser ligada primeiro");
        }else{
        if (modo == "Silenciado"){
            modo = "Som";
            System.out.println("A TV voltou a emitir som");
        }else{
            modo = "Silenciado";
            System.out.println("A TV está no mudo");
        }
    }
    }
    
    
    
}
