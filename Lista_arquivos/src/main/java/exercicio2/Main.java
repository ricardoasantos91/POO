/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
    Funcionario funcionario1 = new Funcionario(50,"Ricardo",30,20);
    Funcionario funcionario2 = new Funcionario(51,"Jonathas",31,22);
    Funcionario funcionario3 = new Funcionario(52,"Camila",32,23);
    
    CadastroFuncionario funcionarios = new CadastroFuncionario();
    
    funcionarios.inserirFuncionario(funcionario1);
    funcionarios.inserirFuncionario(funcionario2);
    funcionarios.inserirFuncionario(funcionario3);
    
    
    File file = new File("input.bin");
    try (FileOutputStream fos = new FileOutputStream(file)){
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(funcionarios);
            //oos.writeObject(funcionario2);
            //oos.writeObject(funcionario3);

            oos.close();
            fos.close();
    }catch (IOException e) {
                e.printStackTrace();
            }

    Funcionario  funcionario = funcionarioSearch(file);
    System.out.println(funcionario.getNome());
}
    
    public static Funcionario funcionarioSearch(File file) {
        
        Scanner teclado = new Scanner(System.in);
        String nome;
        nome = teclado.nextLine();
        
        try(FileInputStream fileStream = new FileInputStream(file)){
            // Creating an object input stream
            try(ObjectInputStream objStream = new ObjectInputStream(fileStream)){
                
                try{
                    CadastroFuncionario funcionarios = (CadastroFuncionario) objStream.readObject();
                    Funcionario funcionario = funcionarios.buscarFuncionario(nome);
                    return funcionario;
                }catch(Exception e){
                    e.printStackTrace();
                }
                    
                objStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            
        
    }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            }catch(IOException e){
                e.printStackTrace();
            }
        
    
    return null;
    
}
}