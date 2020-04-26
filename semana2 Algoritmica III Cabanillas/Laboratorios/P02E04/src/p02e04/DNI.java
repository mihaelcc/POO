/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p02e04;

/**
 *
 * @author michael
 */
public class DNI {
    
    private String numero;
    
//atributos objetos:    
    private Persona dueño;
    private Fecha emision, caducidad;
    
//constructor
    
    public DNI(String numero, Persona dueño, Fecha emision, Fecha caducidad)
    {this.numero=numero;
    this.caducidad=caducidad;
    this.emision=emision;
    this.dueño=dueño;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Fecha getEmision() {
        return emision;
    }

    public void setEmision(Fecha emision) {
        this.emision = emision;
    }

    public Fecha getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Fecha caducidad) {
        this.caducidad = caducidad;
    }
   
    
    
}
