/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;


import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Sala
 */
public class Artista implements Comparable<Artista> {
    Set<Musica> musicas = new TreeSet();
    private String nome;
    
    public Artista(){
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public Artista(String nome_artista) {
        this.nome = nome_artista; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Set getMusicas(){
        return this.musicas;
    }

    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }
    
    @Override
    public int compareTo(Artista o) {
        if (this.nome == null && o != null) return -1;
        if (o.getNome() == null && this.nome != null) return 1;
        return ((this.nome).compareTo(o.getNome()));
    } 
}

