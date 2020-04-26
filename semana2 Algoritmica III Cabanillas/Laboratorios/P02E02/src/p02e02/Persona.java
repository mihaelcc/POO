/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p02e02;

/**
 *
 * @author michael
 */
public class Persona {
  
    //atributos  
    
    private String nombre, apellido;
    private int edad;
    private double peso;
    
 //constructor
    
    public Persona(String nombre, String apellido, int edad, double peso)
    {this.apellido=apellido;
    this.edad=edad;
    this.nombre=nombre;
    this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
}
