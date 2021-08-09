/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicocomputadores.registrorecebimentos;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import servicocomputadores.recebivel.Recebivel;
import servicocomputadores.recebivel.itemvenda.ItemVenda;
import servicocomputadores.recebivel.servico.Servico;

/**
 *
 * @author ricar
 */
public class RegistroRecebimentos {
    public static void main(String[] args){
        
        List<Recebivel> registros = new ArrayList<Recebivel>();
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        //teclado.useDelimiter("\n");
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int n;
        
        String descricao;
        
        int quantidade;
        
        double precoHora;
        
        
        System.out.println("Digite 1 para imprimir a lista e 2 para adicionar uma receita");
        n = teclado.nextInt();
        
        while(n == 1 || n == 2){
            
            if (n == 1){
                for(Recebivel recebivel: registros){
                    recebivel.imprimirItem();
                }
            }else{
                if(n == 2){
                    System.out.println("Qual tipo? 1 - serviço, 2 - venda");
                    n = teclado.nextInt();
                    
                    if(n == 1){
                        System.out.println("Descrição?");
                        descricao = scanner.next();
                        System.out.println("Horas?");
                        quantidade = teclado.nextInt();
                        System.out.println("Preço por hora?");
                        precoHora = teclado.nextDouble();
                        registros.add(new Servico(descricao,quantidade,precoHora));
                        
                    }else{
                        if(n == 2){
                            System.out.println("Item?");
                            descricao = scanner.next();
                            System.out.println("Quantidade?");
                            quantidade = teclado.nextInt();
                            System.out.println("Preço unitário?");
                            precoHora = teclado.nextDouble();
                            registros.add(new ItemVenda(descricao,quantidade,precoHora));

                        }
                    }
                    
                }
                
            }
            
            
            System.out.println("Digite 1 para imprimir a lista e 2 para adicionar uma receita");
            n = teclado.nextInt();
        }
        
        
        
    }
}
