/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;
import static java.lang.Math.PI;
/**
 *
 * @author Sala
 */
public class Circulo extends Figura{
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    @Override
    public void calcularArea(){
        this.area = this.raio*this.raio*PI;
    }
}
