/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e05;

/**
 *
 * @author Pablito
 */
public class TAXI extends VEHICULO{
    
    private int numero_licencia;
    
    public TAXI(String matricula, String modelo, String foto, double potencia,
            int numero_licencia){
        super(matricula, modelo, foto, potencia);
        this.numero_licencia = numero_licencia;
    }

    public int getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(int numero_licencia) {
        this.numero_licencia = numero_licencia;
    }
}
