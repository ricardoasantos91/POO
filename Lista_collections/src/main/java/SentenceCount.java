
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class SentenceCount {
    
    public static void main(String[] args){
        
        Map<String,Integer> dicionario = new HashMap<>();

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque a frase:");
        String message = scan.nextLine();
        
        for (String word : message.split(" ")){
            Set<String> conjunto = dicionario.keySet();

            if (conjunto.contains(word)){
                dicionario.put(word, dicionario.get(word) + 1);
            }else{
                dicionario.put(word,1);
            }
            
        }
        
        for (String word : dicionario.keySet()) {
            System.out.println("Palavra: " + word + " Quantidade: " +
            dicionario.get(word));

        }
        
        
}
    
}
