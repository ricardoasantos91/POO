/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Sala
 */


public class Karaoke {
    Set<Musica> musicas = new TreeSet<Musica>();
    Set<Artista> musicas_autores = new TreeSet<Artista>();
    List<Musica> fila_musica = new ArrayList();
    
    
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
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Qual o nome do artista?");
        
        String nome_artista = teclado.nextLine();
        
        System.out.println("Qual o nome da música?");
        
        String nome_musica = teclado.nextLine();
        
        int i = 0;
        for (Artista item: musicas_autores){


            if (item.getNome().equals(nome_artista)){

                Musica musica = new Musica(nome_musica,item);
                item.addMusica(musica);
                i++;
                musicas.add(musica);
            } 
        }
                
        if (i == 0){
            Artista artista = new Artista(nome_artista);     
            Musica musica = new Musica(nome_musica,artista);
            artista.addMusica(musica);
            musicas_autores.add(artista);
            musicas.add(musica);
        }

        
        

        
    }
    
    public void imprimirFila(){
        System.out.println("Fila: ");
        if (fila_musica.size() > 0){
            
        for(int i = 0; i < fila_musica.size(); i++){
            System.out.println("Posição " + (i+1) + " Música: " + fila_musica.get(i).getNome() + " Artista: " + fila_musica.get(i).getArtist());
        }
        }else{
            System.out.println("Não há nenhuma música na fila");
        }
    }
    
    public void buscar_artista(){
        List<Artista> artistas = new ArrayList();
        List<Musica> musicas = new ArrayList();
        int i;
        i = 1;
        System.out.println("Selecione a música:");
        for(Artista artista : musicas_autores){

            //Set<Musica> musicas_atuais = artista.getMusicas();
            for(Musica item: artista.musicas){
                System.out.println(i + ": Artista: " + artista.getNome() + " Música: " + item.getNome());
                artistas.add(artista);
                musicas.add(item);
                i++;
            }
        }
        
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        
        fila_musica.add(musicas.get(n-1));

       
        
        
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
        List<Artista> artistas = new ArrayList();
        List<Musica> musicas_lista = new ArrayList();
        int i;
        i = 1;
        System.out.println("Selecione a música:");
        for(Musica musica : musicas){
            String artista_atual = musica.getArtist();

            System.out.println(i + ": Música: " + musica.getNome() + " Artista: " + artista_atual);
            artistas.add(musica.getArtistObject());
            musicas_lista.add(musica);
            i++;
            }
        
        
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        
        fila_musica.add(musicas_lista.get(n-1));
    
    }
    
    
    public void cantar(){
        if (fila_musica.size() > 0){
            Musica musica = fila_musica.get(0);
            
            System.out.println("A música " + musica.getNome() + " do artista " + musica.getArtist() + " foi cantada.");
            fila_musica.remove(0);
        }else{
            System.out.println("Não há música na fila");
        }
    
    
}
}

