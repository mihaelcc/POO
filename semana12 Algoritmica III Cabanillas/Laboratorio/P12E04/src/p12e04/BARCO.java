/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e04;

/**
 *
 * @author Pablito
 */
public class BARCO {
    
    private String nombre, flotabilidad;
    private double velocidad;
    
    public BARCO(String nombre, String flotabilidad, double velocidad){
        this.nombre = nombre;
        this.flotabilidad = flotabilidad;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFlotabilidad() {
        return flotabilidad;
    }

    public void setFlotabilidad(String flotabilidad) {
        this.flotabilidad = flotabilidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
}
