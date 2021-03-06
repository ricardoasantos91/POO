package com.mycompany.projeto;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class CadastroChamado implements Serializable{
  private static List<Chamado> chamados = new ArrayList<>();

  public static void inserir(Chamado chamado){
    chamados.add(chamado);
  }

  public static Chamado buscarPorId(int id)throws Exception{
    for(Chamado pes: chamados){
      if(pes.getId() == id){
        return pes;
      }
    }
    throw new Exception("CHAMADO NÃO EXISTE!");
  }

  public static void remover(Chamado chamado)throws Exception{
    try{
      Chamado cha = buscarPorId(chamado.getId());
      chamados.remove(cha);
    }
    catch(Exception e){
      throw e;
    }
  }

  public static List<Chamado> buscarPorCliente(CadastroPessoa cadastro, Cliente cliente)throws Exception{
    List<Chamado> chamadosEncontrados = new ArrayList<Chamado>();

    try{
      cadastro.buscarPorCpf(cliente.getCpf());

      for(Chamado chamado : chamados){
        if(chamado.getCliente().getCpf().equals(cliente.getCpf())){
          chamadosEncontrados.add(chamado);
        }
      }
    }
    catch(Exception e){
      throw e;
    }
    finally{
      return chamadosEncontrados;
    }
  }

  public static List<Chamado> buscarPorAtendente(CadastroPessoa cadastro, Atendente atendente)throws Exception{
    List<Chamado> chamadosEncontrados = new ArrayList<Chamado>();

    try{
      cadastro.buscarPorCpf(atendente.getCpf());

      for(Chamado chamado : chamados){
        if(chamado.getAtendente().getCpf().equals(atendente.getCpf())){
          chamadosEncontrados.add(chamado);
        }
      }
    }
    catch(Exception e){
      throw e;
    }
    finally{
      return chamadosEncontrados;
    }
  }

  public static List<Chamado> buscarPorEstado(Estado estado)throws Exception{
    List<Chamado> chamadosEncontrados = new ArrayList<Chamado>();

    try{
      for(Chamado chamado : chamados){
        if(chamado.getEstado().equals(estado)){
          chamadosEncontrados.add(chamado);
        }
      }
    }
    catch(Exception e){
      throw e;
    }
    finally{
      return chamadosEncontrados;
    }
  }

  public static List<Chamado> buscarPorCriticidade(Criticidade criticidade)throws Exception{
    List<Chamado> chamadosEncontrados = new ArrayList<Chamado>();

    try{
      for(Chamado chamado : chamados){
        if(chamado.getCriticidade().equals(criticidade)){
          chamadosEncontrados.add(chamado);
        }
      }
    }
    catch(Exception e){
      throw e;
    }
    finally{
      return chamadosEncontrados;
    }
  }

  public static List<Chamado> buscarPorServico(Servico servico)throws Exception{
    List<Chamado> chamadosEncontrados = new ArrayList<Chamado>();

    try{
      for(Chamado chamado : chamados){
        if(chamado.getServico().equals(servico)){
          chamadosEncontrados.add(chamado);
        }
      }
    }
    catch(Exception e){
      throw e;
    }
    finally{
      return chamadosEncontrados;
    }
  }
}