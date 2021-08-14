/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        //IllegalArgumentException acontece quando um argumento inválido é passado
        //para um método
        //NumberFormatException acontece quando se tenta converter um string
        //em um tipo numérico mas o string não possui o formato apropriado
        Scanner teclado = new Scanner(System.in);
        while(true){
            try{
                String i =teclado.nextLine();
                int a = Integer.parseInt(i);
                methodA(a);
                System.out.println("Sucesso");
                break;

                
            }catch(NumberFormatException ex){
                System.out.println("Formato inválido, tente novamente");
            }catch(IllegalArgumentException ex){
                System.out.println("Argumento menor que 0");
            }
            
            


            
    }
    }
    public static void methodA(int a) throws IllegalArgumentException{
        if(a <= 0) throw new IllegalArgumentException();
    }
}
