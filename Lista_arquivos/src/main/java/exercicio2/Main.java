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
/**
 *
 * @author Sala
 */
public class Main {
    public static void main(String[] args){
    Funcionario funcionario1 = new Funcionario(50,"Ricardo",30,20);
    Funcionario funcionario2 = new Funcionario(51,"Jonathas",31,22);
    Funcionario funcionario3 = new Funcionario(52,"Camila",32,23);
    
    File file = new File("input.txt");
    try (FileOutputStream fos = new FileOutputStream(file)){
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(funcionario1);
            oos.writeObject(funcionario2);
            oos.writeObject(funcionario3);
    
    }catch (IOException e) {
                e.printStackTrace();
            }
    File file2 = new File("input.txt");
    Funcionario  funcionario = funcionarioSearch(file2);
    
}
    
    public static Funcionario funcionarioSearch(File file) {
        
        try(FileInputStream fileStream = new FileInputStream(file)){
            // Creating an object input stream
            try(ObjectInputStream objStream = new ObjectInputStream(fileStream)){
                while(true){
                    try(Class funcionario = objStream.readObject()){
                    System.out.println(funcionario.getNome());
                    }catch(Exception e){
                        break;
                    }
                    }
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