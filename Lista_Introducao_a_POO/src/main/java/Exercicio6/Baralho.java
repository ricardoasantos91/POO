/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

import java.util.Random;

/**
 *
 * @author Sala
 */
public class Baralho {
    Carta[] cartas = new Carta[52];
    int numeroDeCartas = 0;
    String modo;
    
    void adicionarCarta(String valor, String naipe){
        int n = temNoBaralho(valor,naipe);
        if (n == 0){
            Carta carta = new Carta();
            carta.naipe = naipe;
            carta.valor = valor;
            cartas[numeroDeCartas] = carta;
            numeroDeCartas++;
        }
    }
    
    int temNoBaralho(String valor, String naipe){
        for(int i = 0;i < numeroDeCartas;i++){
            if(cartas[i].valor == valor && cartas[i].naipe == naipe){
                return 1;
            }
        }
        return 0;        
    }
   
    void cartaSwap(Carta c1, Carta c2){
        String tempNaipe;
        String tempValor;
        
        tempNaipe = c1.naipe;
        tempValor = c1.valor;
        
        c1.naipe = c2.naipe;
        c1.valor = c2.valor;
        
        c2.naipe = tempNaipe;
        c2.valor = tempValor;
    }
    
    void embaralhar(){
        Random aleatorio = new Random();
        int valor;
        int valor2;
        for(int i = 0;i <= 100;i++){
            valor = aleatorio.nextInt((51-0)+1)+0;
            valor2 = aleatorio.nextInt((51-0)+1)+0;
            
            Carta c1 = cartas[valor];
            Carta c2 = cartas[valor2];
            
            cartaSwap(c1,c2);
        }
        System.out.println("Baralho foi embaralhado.");
    }
    
    void encherBaralho(){
        String[] valores = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] naipes = {"Copas","Paus","Espadas","Ouros"};
       
        
        for(int j = 0;j < 4;j++){
            for(int i = 0;i < 13;i++){
                adicionarCarta(valores[i],naipes[j]);

            }
        }
        
        
    }
       
    void imprimir(){
        for(int i = 0;i < 52;i++){
            System.out.println("Valor: " + cartas[i].valor + " Naipe: " + cartas[i].naipe);
        }
    }
   
    
    void colocarEmOrdem(){
        String[] valores = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] naipes = {"Copas","Paus","Espadas","Ouros"};
        
        String valor;
        String valor2;
        String naipe;
        String naipe2;
        
        int pos_valor = 0;
        int pos_naipe = 0;
        int pos_valor2 = 0;
        int pos_naipe2 = 0;
        
        for(int i = 0;i < 52;i++){
            for(int j = i+1;j < 52;j++){
                Carta c1 = cartas[i];
                Carta c2 = cartas[j];
                valor = c1.valor;
                valor2 = c2.valor;
                naipe = c1.naipe;
                naipe2 = c2.naipe;
                
                for(int w = 0; w < 4;w++){
                    if (naipe == naipes[w]){
                        pos_naipe = w;
                    }
                    if(naipe2 == naipes[w]){
                        pos_naipe2 = w;
                    }
                }
                

                
                if (pos_naipe > pos_naipe2){
                    cartaSwap(c1,c2);
                }else{
                    if(pos_naipe == pos_naipe2){
                        for(int w = 0; w < 13; w++){
                            if (valor == valores[w]){
                                pos_valor = w;
                            }
                            if(valor2 == valores[w]){
                                pos_valor2 = w;
                            }
                        }
                        if (pos_valor > pos_valor2){
                            cartaSwap(c1,c2);
                        }
                    }
                }
            }
        }
        System.out.println("Baralho foi colocado em ordem.");
    }
}
