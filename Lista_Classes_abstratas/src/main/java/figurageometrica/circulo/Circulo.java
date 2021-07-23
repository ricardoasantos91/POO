/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica.circulo;

import figurageometrica.FormaGeometrica;
import static java.lang.Math.PI;
/**
 *
 * @author ricar
 */
public class Circulo extends FormaGeometrica {
    
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = (float) PI*this.raio*this.raio;
    }
    

    @Override
    public void calcularPerimetro() {
        this.perimetro = (float)PI*2*this.raio;
    }

    
    
    
}
