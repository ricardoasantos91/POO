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
public class Pessoa {
    String nome;
    int idade;
    
    void imprimirPessoa(){
        System.out.println("Nome: " + nome + " idade: " + idade);
    }
    
    void fazerAniversario(){
        idade = idade + 1;
    }
}
