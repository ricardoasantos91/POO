/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class CadastroCliente {
    private List<Cliente> clientes = new ArrayList();
    
    public void inserirCliente(Cliente cliente) throws ClienteJaExisteException{
        String CPF_do_cliente = cliente.getCPF();
        String CPF_atual;
        int k = 0;
        for(Cliente cliente_atual:clientes){
            CPF_atual = cliente_atual.getCPF();
            if(CPF_atual.equals(CPF_do_cliente)){
                k = 1;
                break;
            }
        }
        if(k == 0){
            clientes.add(cliente);
        }else{
            throw new ClienteJaExisteException("Cliente já existe");
            
        }
    }
    
    public void removerCliente(Cliente cliente) throws ClienteNaoExisteException{
        String CPF_cliente = cliente.getCPF();
        String CPF_atual;
        int k = 0;
        for(Cliente cliente_atual:clientes){
            CPF_atual = cliente_atual.getCPF();
            if(CPF_atual.equals(CPF_cliente)){
                clientes.remove(cliente_atual);
                k = 1;
                break;
            }
        }
        if (k == 0){
            throw new ClienteNaoExisteException("Cliente não existe");
        }
    }
    
    public Cliente buscarClienteporCPF(String CPF){
        String CPF_cliente;
        for(Cliente cliente:clientes){
            CPF_cliente = cliente.getCPF();
            
            if (CPF.equals(CPF_cliente)){
                return cliente;
            }
        }
        
        return null;
    }
    
    public List<Cliente> buscarClienteporNome(String nome){
        
        List<Cliente> new_clientes = new ArrayList();
        
        String nome_cliente;
        for(Cliente cliente:clientes){
            nome_cliente = cliente.getNome();
            
            if (nome.equals(nome_cliente)){
                new_clientes.add(cliente);
            }
        }
        if(clientes.size() == 0){
            return null;
        }else{
            return new_clientes;
        }
    }
}
