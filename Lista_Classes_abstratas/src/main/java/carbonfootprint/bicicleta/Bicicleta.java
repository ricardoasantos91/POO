/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbonfootprint.bicicleta;
import carbonfootprint.CarbonFootprint;
/**
 *
 * @author ricar
 */
public class Bicicleta implements CarbonFootprint {
    
    
    private float kmPercorrida = 0;
    
    
    public void pedalarKm(){
        this.kmPercorrida++;
    }
    
    
    @Override
    public float getCarbonFootprint() {
        //https://www.bikeradar.com/features/long-reads/cycling-environmental-impact/
        return 21*this.kmPercorrida;
    }
    
}
