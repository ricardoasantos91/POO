
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
public class Exercicio1 {
    
    public static void main(String[] args){
    int n;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor de n");
    
    n = teclado.nextInt();
    
    int resposta;
    int valor;
    resposta = 0;

    for(int i = 1; i <= n; i++){
        System.out.println("Digite o valor " + i);
        valor = teclado.nextInt();
        
        if (valor < 0)
            resposta = resposta + 1;
    }
    
    System.out.println(resposta + " numero(s) é(são) negativo(s)");
    
    

    
}
}
