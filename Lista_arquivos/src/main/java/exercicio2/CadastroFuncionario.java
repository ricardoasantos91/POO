/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala
 */
public class CadastroFuncionario implements Serializable{
    List<Funcionario> funcionarios = new ArrayList();
    
    
    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public Funcionario buscarFuncionario(String funcionario_nome){
        for(Funcionario funcionario_atual:funcionarios){
            if ((funcionario_atual.getNome()).equals(funcionario_nome)){
                return funcionario_atual;
        }
        }
        return null;
    }    
    
    
    
    
}
