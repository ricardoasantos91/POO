
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
public class Exercicio7 {
    public static void main(String[] args){
        
        int n_pessimo;
        int n_boa;
        int n_otima;
        int n_ruim;
        int n;
        
        int valor;
        
        double perc_pessimo;
        double perc_boa;
        double perc_otima;
        double perc_ruim;
        
        n_pessimo = 0;
        n_boa = 0;
        n_otima = 0;
        n_ruim = 0;
        
        perc_pessimo = 0;
        perc_boa = 0;
        perc_ruim = 0;
        perc_otima = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor da avaliação: ");
        valor = teclado.nextInt();
        
        while(valor >= 0 & valor <= 100){
            
            if (valor >= 0 & valor <= 25)
                n_pessimo = n_pessimo + 1;
                
                else
                    if(valor > 25 & valor <= 50)
                        n_ruim = n_ruim + 1;
                        else
                                
                            if(valor > 50 & valor <= 75)
                                n_boa = n_boa + 1;
                                else
                                    n_otima = n_otima + 1;
                            
            
            
            
            
            
            valor = teclado.nextInt();
            
            
            
        }
        n = n_boa + n_otima + n_pessimo + n_ruim;
        
        if (n>0)
            perc_pessimo = (double) n_pessimo/n*100;
            perc_boa = (double) n_boa/n*100;
            perc_otima = (double) n_otima/n*100;
            perc_ruim = (double) n_ruim/n*100;
            
            System.out.println("Perc de funcionarios que avaliaram como péssimo: " + perc_pessimo + "%");
            System.out.println("Perc de funcionarios que avaliaram como ruim: " + perc_ruim + "%");
            System.out.println("Perc de funcionarios que avaliaram como bom: " + perc_boa + "%");
            System.out.println("Perc de funcionarios que avaliaram como ótimo: " + perc_otima + "%");

    }
}
