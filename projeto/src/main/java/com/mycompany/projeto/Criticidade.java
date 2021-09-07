public enum Criticidade{
  BAIXA("Baixa"),
  MEDIA("Média"),
  ALTA("Alta"),
  URGENTE("Urgente");

  private String nome;

  Criticidade(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }
}