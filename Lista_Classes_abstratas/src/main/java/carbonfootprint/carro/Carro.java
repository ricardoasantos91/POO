/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbonfootprint.carro;
import carbonfootprint.CarbonFootprint;
/**
 *
 * @author ricar
 */
public class Carro implements CarbonFootprint {
    private String combustivel;
    private float kmPercorrida = 0;
    private float consumoMedio;
    
    public void setConsumoMedio(float consumoMedio){
        this.consumoMedio = consumoMedio;
    }
    
    public void dirigirKm(){
        this.kmPercorrida++;
    }
    

    @Override
    public float getCarbonFootprint() {
        float gasto;
        float carbon;
        //https://ecoscore.be/en/info/ecoscore/co2
        if(this.combustivel == "Diesel"){
            carbon = 2640.0f;
        }else{
            carbon = 2392.0f;
        }
        gasto = carbon*(this.kmPercorrida/this.consumoMedio);
        return gasto;
    }
    
}
