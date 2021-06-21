/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Santos
 */
public class Exercicio3 {
    public static void main(String[] args){
        int soma;
        soma = 0;
        for(int i = 1; i <= 999; i++){
            soma = soma + i;
        }
        System.out.println("A soma de 1 até 999 é " + soma);
    }
}
