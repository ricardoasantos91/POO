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
public class Porta {
    String cor;
    int profundidade;
    int largura;
    int comprimento;
    String estado;
    
    
    void abrirPorta(){
        if (estado == "Aberta"){
            System.out.println("Porta já está aberta");
        }else{
        estado = "Aberta";
    }
    }
    
    void fecharPorta(){
        if (estado == "Fechada"){
            System.out.println("Porta já está fechada");
        }else{
            estado = "Fechada";
        }
    }
    
    void estaAberta(){
        if(estado == "Aberta"){
            System.out.println("Porta está aberta");
            
        }else{
            System.out.println("Porta esta fechada");
        }
    }
    
    void imprimirPorta(){
        System.out.println("Atributos da porta: ");
        System.out.println("Cor: " + cor);
        System.out.println("Dimensões: ");
        System.out.println("Profundidade: " + profundidade + " Largura: " + largura + " Comprimento: " + comprimento);        
        System.out.println("Estado: " + estado);
    }
    
    
}
