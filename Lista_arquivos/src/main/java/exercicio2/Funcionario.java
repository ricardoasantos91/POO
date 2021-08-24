/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.io.Serializable;

/**
 *
 * @author Sala
 */
public class Funcionario implements Serializable{
    private int registro;
    private String nome;
    private int departamento;
    private int departamento_gerenciado;
    
    public Funcionario(int registro, String nome, int departamento, int departamento_gerenciado){
        this.registro = registro;
        this.nome = nome;
        this.departamento = departamento;
        this.departamento_gerenciado = departamento_gerenciado;
    }
    
    public String getNome(){
        return this.nome;
    }
}
