
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
public class Exercicio5 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int N;
        
        System.out.println("Digite o valor de N");
        N = teclado.nextInt();
        int fatorial;
        fatorial = 1;
        if (N > 0)

        
            for(int i = N; i >= 1; i--){
                fatorial = fatorial * i;
            }
            
            System.out.println("Fatorial de " + N + " é " + fatorial);
        
        
    }
}
