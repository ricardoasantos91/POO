import java.util.ArrayList;
import java.util.List;

public class Atendente extends Pessoa{
  public Atendente(String nome, String cpf, String data_nasc, String endereco, String email, String telefone, Departamento departamento){
    super(nome, cpf, data_nasc, endereco, email, telefone, departamento);
  }

  public List<Chamado> listarChamados(){
    return null;
  }
}