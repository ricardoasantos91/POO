package Exercicio1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class Agenda {
    
    int numeroDeContatos = 0;
    Contato[] contatos = new Contato[100];
    
    
    void receberContato(){
        String nome;
        String telefone;
        String email;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nome do contato?");
        nome = teclado.next();
        System.out.println("Telefone?");
        telefone = teclado.next();
        System.out.println("Email?");
        
        email = teclado.next();
        
        addContato(nome,telefone,email);
    }
    void addContato(String nome, String telefone, String email){
        Contato contato = new Contato();
        contato.nome = nome;
        contato.telefone = telefone;
        contato.email = email;
        contatos[numeroDeContatos] = contato;
        numeroDeContatos++;

    }
    
    void imprimirAgenda(){
        for(int i = 0; i < numeroDeContatos;i++){
            System.out.println("Contato: " + contatos[i].nome + " Telefone: " + contatos[i].telefone + " email: " + contatos[i].email);
        }      
    }
    
}
