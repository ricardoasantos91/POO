/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Santos
 */
public class Exercicio6 {
    
    public static void main(String[] args){
        
        int k;
        int count;
        int anterior;
        
        count = 0;
        k = 0;
        anterior = 1;
        
        while(k <= 100){
            
            System.out.println(k);
            

            k = k + anterior;
            
            if (count == 0)
               anterior = 0;
           else
               anterior = k - anterior;
     

            count = count + 1;
                
            
        
        
        
    }
}
}
