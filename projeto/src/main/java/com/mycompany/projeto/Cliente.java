package com.mycompany.projeto;
import java.util.ArrayList;

public class Cliente extends Pessoa{
  public Cliente(String nome, String cpf, String data_nasc, String endereco, String email, String telefone, Departamento departamento){
    super(nome, cpf, data_nasc, endereco, email, telefone, departamento);
  }

  public void abrirChamado(){
    
  }

  public ArrayList<Chamado> listarChamados(){
    return null;
  }
}