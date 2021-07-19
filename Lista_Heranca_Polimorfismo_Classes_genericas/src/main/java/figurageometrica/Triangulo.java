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
public class Triangulo extends Retangulo {
    
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        this.area = this.base*this.altura/2;
    }
}

