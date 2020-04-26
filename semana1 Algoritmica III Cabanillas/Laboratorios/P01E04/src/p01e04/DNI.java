/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p01e04;

/**
 *
 * @author michael
 */
public class DNI {
    
    private String numero;
    
//atributos objetos:    
    private Persona dueño;
    private Fecha emision, caducidad;
    
//metodos get
    
    public String getNumero(){return numero;}
    public Persona getDueño(){return dueño;}
    public Fecha getEmision(){return emision;}
    public Fecha getCaducidad(){return caducidad;}
    
//metodos set
    
    public void setNumero(String n){numero=n;}
    public void setDueño(Persona p){dueño=p;}
    public void setEmision(Fecha e){emision=e;}
    public void setCaducidad(Fecha c){caducidad=c;}
    
    
}
