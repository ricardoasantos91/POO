/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.funcionario;
import empresa.funcionario.assalariado.*;
import empresa.funcionario.comissionado.*;
import empresa.funcionario.comissionadosalariobase.*;
import empresa.funcionario.recebeporhora.*;



import java.util.ArrayList;
/**
 *
 * @author ricar
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        float salarioBase = 1500.0f;
        float salarioBase_vendas = 600.0f;
        funcionarios.add(new FuncionarioAssalariado("João",salarioBase));
        funcionarios.add(new FuncionarioComissionado("Carlos",30000,0.2f));
        funcionarios.add(new FuncionarioComissionadoSalarioBase("Manuel",30000,salarioBase_vendas,0.2f));
        funcionarios.add(new FuncionarioHoraExtra("Raimundo",45,salarioBase));
        
        float salario;
        for(Funcionario funcionario: funcionarios){
            
            if (funcionario instanceof FuncionarioComissionadoSalarioBase){
                funcionario.setSalarioBase(funcionario.getSalarioBase()*1.1f);
                salario = funcionario.calcularSalario();
                funcionario.setSalarioBase(funcionario.getSalarioBase()*(1.0f/1.1f));
            }else{
                salario = funcionario.calcularSalario();
            }
            
            System.out.println("Salário do funcionário " + funcionario.getNome() + " é: " + salario);
     
    
        }
    
}
}
