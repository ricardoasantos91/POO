/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbonfootprint.construcao;
import carbonfootprint.CarbonFootprint;
/**
 *
 * @author ricar
 */
public class Construcao implements CarbonFootprint{
    private int numeroDePessoas;
    private Boolean usoDeEnergiaRenovavel;
    private int numerodeLampadas;
    private Boolean usoDeArCondicionado;
    
    @Override
    public float getCarbonFootprint() {
        return 0.0f;
    }
    
    
}
