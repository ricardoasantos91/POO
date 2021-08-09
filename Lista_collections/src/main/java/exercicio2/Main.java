/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
        List<String> mylist = new ArrayList();

        mylist.add("Oi");
        mylist.add("Teste");
        mylist.add("POO");
        mylist.add("Palavras");
        mylist.add("Palavras");
        
        String lista = mylist.toString();
        
        System.out.println("ArrayList: " + lista);

        HashSet myset = new HashSet(mylist);

        System.out.println("HashSet: " + myset.toString());
        
        PriorityQueue<String> myvar = new PriorityQueue(myset);
        
        System.out.println("PriorityQueue: " + myvar.toString());
        
        ArrayDeque<String> myvar2 = new ArrayDeque(myvar);
        
        System.out.println("ArrayDeque: " + myvar2.toString());
        
        TreeSet<String> mytree = new TreeSet(myvar2);
        
        System.out.println("TreeSet: " + mytree.toString());
        
        //Aparece em ordem diferente pois são tipos diferentes de coleções
        //Alguns tem ordenamento, outros não possuem e por conta disso
        //a ordem apresentada muda
        
        
        
        
        

        
}
}
