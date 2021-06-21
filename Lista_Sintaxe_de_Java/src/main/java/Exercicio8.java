
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
public class Exercicio8 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("Digite a ordem da matriz n");
        n = teclado.nextInt();
        
        int[][] matriz = new int[n][n];
        
        //Lê a matriz
        for(int i = 1; i <= n; i++){
           for(int j = 1; j <= n; j++){ 
            
            System.out.println("Digite o valor de i = " + (i-1) + " e j = " + (j-1));
            matriz[(i-1)][(j-1)] = teclado.nextInt();
            
        
        }
        }
        int resposta = 1;
        int soma;
        soma = 0;
        //Faz a soma da primeira linha para comparar com o resto
        for(int i = 1; i <= n; i++){
            soma = soma + matriz[0][i-1];
        }
        
        int soma_atual;
        int soma_diag_principal;

        
        soma_diag_principal = 0;
        
        //verificando linhas
        for(int i = 1; i <= n; i++){
            //verifica diag principal
            soma_diag_principal = soma_diag_principal + matriz[i-1][i-1];
            soma_atual = 0;
            for(int j = 1; j <= n; j++){ 
               soma_atual = soma_atual + matriz[i-1][j-1];
            }
            if (soma != soma_atual)
                resposta = 0;
        }
        if(soma_diag_principal != soma){
            resposta = 0;
        }
        
        //verificando colunas
        for(int i = 1; i <= n; i++){
            soma_atual = 0;
            for(int j = 1; j <= n; j++){ 
                soma_atual = soma_atual + matriz[j-1][i-1];
            }
            if (soma != soma_atual)
                resposta = 0;
        }
        

        int k;
        k = 0;
        soma_atual = 0;
        
        //verificando diag_secundaria
        for(int i = n; i >= 1; i--){
            
            soma_atual = soma_atual + matriz[k][(i-1)];
            
            
            k = k + 1;
            
        }
        if(soma != soma_atual)
            resposta = 0;
        
        
    if (resposta == 1)
        System.out.println("É quadrado mágico");
    else
        System.out.println("Não é quadrado mágico");
    }
}
