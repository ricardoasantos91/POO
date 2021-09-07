package com.mycompany.projeto;
public enum TipoEquipamento{
  COMPUTADOR("Computador"),
  NOTEBOOK("Notebook");

  private String nome;

  TipoEquipamento(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }
}