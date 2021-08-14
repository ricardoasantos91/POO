/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class ContaCorrente {
    private float limite = 0;
    private float saldo = 0;
    private float valorLimite = 0;
    
    
    
    public void sacar(float valor) throws IllegalArgumentException{
        if (valor > (this.saldo + (this.valorLimite-this.limite))){
            throw new IllegalArgumentException("Valor maior que o limite disponível");
        }else{
            if(this.saldo > 0){
                if(valor > this.saldo){
                    valor = valor - this.saldo;
                    this.saldo = 0.0f;
                    this.limite = this.limite + valor;
                    
                }else{
                    this.saldo = this.saldo - valor;
                    valor = 0.0f;
                }
            }else{
                this.limite = this.limite + valor;
            }

            }
        }
    
    
    public void depositar(float valor) throws IllegalArgumentException{
        if (valor < 0){
            throw new IllegalArgumentException("Valor menor que 0, forneça um valor maior ou igual a zero");
        }else{
            if (this.limite > 0){
                if(this.limite < valor){
                    valor = valor - this.limite;
                    this.limite = 0.0f;
                    this.saldo = this.saldo + valor;
                    
                }else{
                    this.limite = this.limite - valor;
                    valor = 0.0f;
                }
            }else{
                this.saldo = this.saldo + valor;
            }
            
        }    
    }
    
    public void imprimirConta(){
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite utilizado: " + this.limite);
        System.out.println("Limite Total: " + this.valorLimite);
    }

    public void setValorLimite(float valor) throws IllegalArgumentException{
        if (valor < 0){
            throw new IllegalArgumentException("Valor menor que 0, forneça um valor maior ou igual a zero");
        }
        if(valor < limite){ 
            throw new IllegalArgumentException("Valor é menor que o limite utilizado pelo cliente");
        }
        
        this.valorLimite = valor;
        }
    
    
    
    public void menu(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("O que quer fazer?1 - saque, 2 - deposito, 3 - mudar limite, 4 - imprimir dados");
        n = teclado.nextInt();
        while(n == 1 || n == 2 || n == 3 || n == 4){

            
            switch(n){

            case 1:

                try{
                    System.out.println("Digite o valor para saque");
                    float saque = teclado.nextFloat();
                    sacar(saque);
                }catch(IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
                
                break;

            case 2:

                try{
                    System.out.println("Digite o valor para depósito");
                    float deposito = teclado.nextFloat();
                    depositar(deposito);

                }catch(IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
                
                break;
            
            case 3:

                try{
                    System.out.println("Digite o valor para o limite");
                    float valorLimite = teclado.nextFloat();
                    setValorLimite(valorLimite);

                }catch(IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
                
                break;
            
            case 4:
               imprimirConta();
                
            default:
                break;


    }
            
        System.out.println("O que quer fazer?1 - saque, 2 - deposito, 3 - mudar limite, 4 - imprimir dados");
        n = teclado.nextInt();
        }
        

    }    
}



    
    
    
    
    
    

