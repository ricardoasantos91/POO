/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Sala
 */
public class Musica implements Comparable<Musica>{
    
    
    String nome;
    Artista artista;

    public Musica(String nome, Artista artista){
        this.nome = nome;
        this.artista = artista;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getArtist(){
        return this.artista.getNome();
    }
    
    public Artista getArtistObject(){
        return this.artista;
    }
    
    
     @Override
    public int compareTo(Musica o) {
        if (this.nome == null && o != null) return -1;
        if (o.getNome() == null && this.nome != null) return 1;
        return ((this.nome).compareTo(o.getNome()));
    }
}
