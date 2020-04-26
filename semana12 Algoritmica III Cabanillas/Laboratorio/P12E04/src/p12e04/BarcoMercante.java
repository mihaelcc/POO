/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e04;

/**
 *
 * @author Pablito
 */
public class BarcoMercante extends BARCO{
    
    private int carga_util;
    private String mercania, foto;
    
    public BarcoMercante(String nombre, String flotabilidad, double velocidad,
            int carga_util, String mercancia, String foto){
        super(nombre, flotabilidad, velocidad);
        this.carga_util = carga_util;
        this.mercania = mercancia;
        this.foto = foto;
    }

    public int getCarga_util() {
        return carga_util;
    }

    public void setCarga_util(int carga_util) {
        this.carga_util = carga_util;
    }

    public String getMercania() {
        return mercania;
    }

    public void setMercania(String mercania) {
        this.mercania = mercania;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
