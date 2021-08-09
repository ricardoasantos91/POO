/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Sala
 */
public class Karaoke {
    Map<String,List<String>> musicas = new TreeMap();
    Map<String,List<String>> musicas_autores = new TreeMap();
    List<String> fila_musica = new ArrayList();
    List<String> fila_autores = new ArrayList();
    
    
    public void menu(){
        
        Scanner teclado = new Scanner(System.in);
        
        int n;
        n = 1;
        
        while(n != 6){
            System.out.println("O que quer fazer?");
            System.out.println("1 - Adicionar música no karaoke");
            System.out.println("2 - Imprimir fila");
            System.out.println("3 - Selecionar música por artista");
            System.out.println("4 - Selecionar música por nome da música");
            System.out.println("5 - Cantar");
            System.out.println("6 - Sair");
            
            n = teclado.nextInt();
            
            switch (n) {
                case 1:
                    addMusic();
                    break;
                case 2:
                    imprimirFila();
                    break;
                case 3:
                    buscar_artista();
                    break;
                case 4:
                    buscar_musica();
                    break;
                case 5:
                    cantar();
                    break;

                default:
                    break;
            }
        }
    }
    

    public void addMusic(){
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Qual o nome da música?");
        
        String musica = teclado.nextLine();
        
        System.out.println("Qual o nome do artista?");
        
        String artista = teclado.nextLine();        
        
        List c = musicas.getOrDefault(musica, null);
        if (c == null){
            List<String> d = new ArrayList();
            d.add(artista);
            musicas.put(musica,d);
        }else{
            c.add(artista);
            musicas.put(musica,c);
        }
        
        List a = musicas_autores.getOrDefault(artista, null);
        if (a == null){
            List<String> b = new ArrayList();
            b.add(musica);
            musicas_autores.put(artista,b);
        }else{
            a.add(musica);
            musicas_autores.put(artista,a);
        }
    }
    
    public void imprimirFila(){
        System.out.println("Fila: ");
        if (fila_musica.size() > 0){
            
        for(int i = 0; i < fila_musica.size(); i++){
            System.out.println("Posição " + (i+1) + " Música: " + fila_musica.get(i) + " Artista: " + fila_autores.get(i));
        }
        }else{
            System.out.println("Não há nenhuma música na fila");
        }
    }
    
    public void buscar_artista(){
        List<String> artistas = new ArrayList();
        List<String> musicas = new ArrayList();
        int i;
        i = 1;
        System.out.println("Selecione a música:");
        for(String artista : musicas_autores.keySet()){
            for(String item: musicas_autores.get(artista)){
                System.out.println(i + ": Artista: " + artista + " Música: " + item);
                artistas.add(artista);
                musicas.add(item);
                i++;
            }
        }
        
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        
        fila_musica.add(musicas.get(n-1));
        fila_autores.add(artistas.get(n-1));
       
        
        
        /*
        List a = musicas_autores.getOrDefault(artista_procurado, null);
        
        if (a != null){
            System.out.println("Selecione uma música: ");
            
            for(int i = 0; i < a.size(); i++){
                System.out.println(i + ": " + a.get(i));
            }
            int n;
            
            n = -1;
            
            while(n > (a.size()-1) | n < 0){
                Scanner teclado = new Scanner(System.in);
                n = teclado.nextInt();
            }
            return n;
        }else{
            
            return -1;
        }
        */
    }    
    
    
    public void buscar_musica(){
        List<String> artistas = new ArrayList();
        List<String> musicas_lista = new ArrayList();
        int i;
        i = 1;
        System.out.println("Selecione a música:");
        for(String musica : musicas.keySet()){
            for(String item: musicas.get(musica)){
                System.out.println(i + ": Música: " + musica + " Artista: " + item);
                artistas.add(item);
                musicas_lista.add(musica);
                i++;
            }
        }
        
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        
        fila_musica.add(musicas_lista.get(n-1));
        fila_autores.add(artistas.get(n-1));
    
    }
    
    public void cantar(){
        if (fila_musica.size() > 0){
            String musica = fila_musica.get(0);
            String autor = fila_autores.get(0);
            
            System.out.println("A música " + musica + " do artista " + autor + " foi cantada.");
            fila_musica.remove(0);
            fila_autores.remove(0);
        }else{
            System.out.println("Não há música na fila");
        }
    
    
}
}
