/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author ricar
 */
public class ClienteJaExisteException extends Exception{
    public ClienteJaExisteException(String msg){
        super(msg);
    }
}
