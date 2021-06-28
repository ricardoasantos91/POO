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
public class Casa {
    
    String cor;
    int numeroDePortas = 0;
    
    Porta[] portas = new Porta[100];
    
    void addPorta(String cor, int profundidade, int largura, int comprimento, String estado){
        Porta porta = new Porta();
        porta.comprimento = comprimento;
        porta.largura = largura;
        porta.profundidade = profundidade;
        porta.estado = estado;
        porta.cor = cor;
        portas[numeroDePortas] = porta;
        numeroDePortas++;
        
    }
    
    void quantasPortasEstaoAbertas(){
        int n = 0;
        for(int i = 0; i < numeroDePortas;i++){
            if (portas[i].estado == "Aberta"){
                n++;
            }
        
        }
        System.out.println(n + " porta(s) esta(ao) aberta(s)");
    }
    
    void pintar(String corPintura){
        cor = corPintura;
    }
    
}
