/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e05;

/**
 *
 * @author Pablito
 */
public class VEHICULO {
    
    private String matricula, modelo, foto;
    private double potencia;
    
    public VEHICULO(String matricula, String modelo, String foto, double potencia){
        this.matricula = matricula;
        this.modelo = modelo;
        this.foto = foto;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
}
