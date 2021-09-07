package com.mycompany.projeto;
public enum Departamento{
  TI("TI");

  private String nome;

  Departamento(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }
}