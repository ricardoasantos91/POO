/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Sala
 */
public class Quadrado extends Figura {
    private float base;
    
    public Quadrado(){
        
    }
    public Quadrado(float lado){
        this.base = lado;
    }
    
    @Override
    public void calcularArea(){
        this.area = this.base*this.base;
    }
}
