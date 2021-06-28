/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

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
    
    
    
    
   
}
