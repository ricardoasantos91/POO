/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        
        int n;
        String nome;
        String telefone;
        String email;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("O que quer fazer? 0 - adicionar contato, 1 - Imprimir agenda, outros = sair");
        
        n = teclado.nextInt();
        
        while(n == 0 || n == 1){
            if(n == 0){

                agenda.receberContato();
                
        
                
            }else{
                if (n == 1){
                    agenda.imprimirAgenda();
                }
            }
            
            System.out.println("O que quer fazer? 0 - adicionar contato, 1 - Imprimir agenda, outros = sair");
            n = teclado.nextInt();
            
            
        }
       
        

        
        
    }
}
