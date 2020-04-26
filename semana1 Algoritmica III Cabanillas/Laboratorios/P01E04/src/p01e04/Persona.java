/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p01e04;

/**
 *
 * @author michael
 */
public class Persona {
    
    private String nombre, apellido;
    private int edad;
    private double peso;
    
    public String getNombre()   {return nombre; }
    public String getApellido() {return apellido; }
    public int getEdad()        {return edad;}
    public double getPeso()     {return peso;}
    
    
    public void setNombre(String n)     {nombre=n;}
    public void setApellido(String a)   {apellido=a;}
    public void setEdad(int e)          {edad=e;}
    public void setPeso(double p)       {peso=p;}
    
    
}
