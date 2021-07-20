/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import agenda.Pessoa;
import agenda.PessoaFisica;
import agenda.PessoaJuridica;
import java.util.Scanner;
/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        int n;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner teclado = new Scanner(System.in);
        
        String entrada;
        String atual;
        
        pessoas.add(new PessoaFisica("Ricardo Santos","111.111.111-11","Rua do Ricardo","01/01/1994"));
        pessoas.add(new PessoaFisica("João Carlos","112.111.111-11","Rua do João","02/01/1994"));
        pessoas.add(new PessoaJuridica("Ricardo SA","01.110.111/0001-01","Rua 2",1520.1f));
        pessoas.add(new PessoaJuridica("Joao SA","02.221.111/0001-01","Rua 3",1300.1f));
        
        System.out.println("O que quer fazer? 0 - Buscar contato, 1 - Imprimir agenda, outros = sair");
        
        n = teclado.nextInt();
        
        while(n == 0 || n == 1){
            if(n == 0){

                 System.out.println("Escreva o cpf ou cnpj");
                 
                 entrada = teclado.next();
                 
                 for (Pessoa pessoa: pessoas){
                     atual = pessoa.getIdentificacao();
                     if (atual == entrada){
                         System.out.println("Nome/Razao Social: " + pessoa.getNome());
                         System.out.println("CPF/CNPJ: " + pessoa.getIdentificacao());
                         System.out.println("Escreva o cpf ou cnpj");
                         System.out.println("Escreva o cpf ou cnpj");
                     }
                 }
                 
        
                
        
                
            }else{
                if (n == 1){
                    agenda.imprimirAgenda();
                }
            }
        
        
    }

    
    
    
    
    
    
}
