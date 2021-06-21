
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Santos
 */
public class Exercicio2 {
    public static void main(String[] args){
        float R;
        float S;
        float T;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de R");
        R = teclado.nextFloat();
        System.out.println("Digite o valor de S");
        S = teclado.nextFloat();
        System.out.println("Digite o valor de T");
        T = teclado.nextFloat();
        
        if (R >= S & R >= T)
            System.out.println("R = " + R + " é o maior");
        else
            if(S >= R & S >= T)
                System.out.println("S = " + S + " é o maior");
            else
                if(T >= R & T >= S)
                    System.out.println("T = " + T + " é o maior");
    }   
}
