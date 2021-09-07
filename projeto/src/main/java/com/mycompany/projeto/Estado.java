package com.mycompany.projeto;
public enum Estado{
  EM_ANALISE("Em análise"),
  ABERTO("Aberto"),
  CANCELADO("Cancelado"),
  CONCLUIDO("Concluído");
  
  private String nome;

  Estado(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }
}