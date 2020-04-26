/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e05;

/**
 *
 * @author Pablito
 */
public class AUTOBUS extends VEHICULO{
    
    private int numero_plazas;
    
    public AUTOBUS(String matricula, String modelo, String foto, double potencia,
            int numero_plazas){
        super(matricula, modelo, foto, potencia);
        this.numero_plazas = numero_plazas;
    }

    public int getNumero_plazas() {
        return numero_plazas;
    }

    public void setNumero_plazas(int numero_plazas) {
        this.numero_plazas = numero_plazas;
    }
}
