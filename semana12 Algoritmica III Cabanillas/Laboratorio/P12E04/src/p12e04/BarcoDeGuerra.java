/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e04;

/**
 *
 * @author Pablito
 */
public class BarcoDeGuerra extends BARCO{
        
    private String artillería, foto;
    private double alcance;
    private int tripulación;
    
    public BarcoDeGuerra(String nombre, String flotabilidad, double velocidad,
            String artillería, String foto, double alcance, int tripulación){
        super(nombre, flotabilidad, velocidad);
        this.artillería = artillería;
        this.foto = foto;
        this.alcance = alcance;
        this.tripulación = tripulación;
    }

    public String getArtillería() {
        return artillería;
    }

    public void setArtillería(String artillería) {
        this.artillería = artillería;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public int getTripulación() {
        return tripulación;
    }

    public void setTripulación(int tripulación) {
        this.tripulación = tripulación;
    }
}
