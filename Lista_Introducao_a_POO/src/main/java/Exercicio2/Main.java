/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author Sala
 */
public class Main {
    
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ricardo";
        pessoa.idade = 20;
        
        pessoa.imprimirPessoa();
        
        for(int i = 1;i <= 5;i++){
            System.out.println("Aniversario " + i + ":");
            pessoa.fazerAniversario();
            pessoa.imprimirPessoa();
    }
    }
       
    }

