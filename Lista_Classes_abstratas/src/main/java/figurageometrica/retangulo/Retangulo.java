/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica.retangulo;
import figurageometrica.FormaGeometrica;
/**
 *
 * @author ricar
 */
public class Retangulo extends FormaGeometrica {
    
    protected float base;
    protected float altura;
    
    public Retangulo(){
        
    }
    
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.base*this.altura;
    }    
    
    @Override
    public void calcularPerimetro() {
        this.perimetro = 2*this.base + 2*this.altura;
    }
    
    /*
    @Override
    public void calcularArea(float base, float altura) {
        this.area = base*altura;
    }

    @Override
    public void calcularPerimetro(float base, float altura) {
        this.perimetro = 2*base + 2*altura;
    }

    */
    
}
