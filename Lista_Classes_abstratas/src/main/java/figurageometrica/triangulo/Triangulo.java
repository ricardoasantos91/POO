/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica.triangulo;

import figurageometrica.FormaGeometrica;

/**
 *
 * @author ricar
 */
public class Triangulo extends FormaGeometrica {

    private float lado1;
    private float lado2;
    private float lado3;
    private float base;
    private float altura;

    
    public Triangulo(float lado1, float lado2, float lado3, float base, float altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.base*this.altura / 2;
    }
    
    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }
    
    /*
    @Override
    public void calcularArea(float base, float altura) {
        this.area = base * altura / 2;
    }

    @Override
    public void calcularPerimetro(float lado1, float lado2, float lado3) {
        this.perimetro = lado1 + lado2 + lado3;

    }
    

    */
}
