/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13e02;

/**
 *
 * @author michael
 */
public class InteresCompuesto extends Interes {
  
    public InteresCompuesto(String nombre, int CapitalInicial, double tasaInteres, int numeroAños){
    super(nombre, CapitalInicial, tasaInteres, numeroAños );
    }
    
    public double capitalFinal(){
    
        return getCapitalInicial()*Math.pow((1+getTasaInteres()),getNumeroAños());
    };
    
    
    
}
