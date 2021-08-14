/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class CadastroCliente {
    Cliente[] clientes = new Cliente[10];
    int numClientes = 0;
    
    
    public void inserirCliente(){
        try{
            inserir();
        }catch(RepositorioException ex){
            System.out.println(ex.getMessage());
        }catch(ClienteJaExistenteException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    public void inserir() throws ClienteJaExistenteException, RepositorioException{
        if (numClientes == 10) throw new RepositorioException("Cadastro cheio");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digite o nome do cliente:");
        String nome = teclado.nextLine();
        System.out.println("Digite o CPF:");
        String CPF = teclado.nextLine();  
        for(int i = 0;i < numClientes;i++){
            String CPF_atual = clientes[i].getCPF();
            if (CPF_atual.equals(CPF)){
                throw new ClienteJaExistenteException("Cliente já existe");
            }
        }
        
        
        Cliente cliente = new Cliente(nome,CPF);
        clientes[numClientes] = cliente;
        
        numClientes = numClientes + 1; 
    }
    
    public Cliente buscarCliente(){
        Cliente cliente = null;
        try{
            cliente = buscar();
        }catch(ClienteInexistenteException ex){
            System.out.println(ex.getMessage());
        }
        return cliente;
    }
    
    public Cliente buscar() throws ClienteInexistenteException{
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digite o CPF:");
        String CPF = teclado.nextLine();  
        Cliente cliente = null;
        int k = 0;
        for(int i = 0;i < numClientes;i++){
            String CPF_atual = clientes[i].getCPF();
            if (CPF_atual.equals(CPF)){
                cliente = clientes[i];
                k = 1;
                break;
            }
        }
        if (k == 0){
            throw new ClienteInexistenteException("Cliente não existe");
        }else{
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
                    
            return cliente;
        }
           
    }
    
}
