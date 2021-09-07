package com.mycompany.projeto;
import java.io.File;

public class Main {
    

  public static void main(String[] args) {
    
    File pessoaArquivo = new File("PessoaArquivo.bin");

    CadastroPessoa cadastroPessoa = PessoaArquivo.lerArquivo(pessoaArquivo);
    
    Pessoa pessoa = cadastroPessoa.buscarPorCpf("123");
    pessoa.print();
    try{
      Tela.exibirMenu(cadastroPessoa);
    }
    catch(Exception e){
        e.printStackTrace();
    }
  }
}