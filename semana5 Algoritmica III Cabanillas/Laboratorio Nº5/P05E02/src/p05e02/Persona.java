/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p05e02;

/**
 *
 * @author michael
 */
public class Persona {
  
    //atributos  
    
    private String nombre, apellido;
    private int edad;
    private double peso;
    private String dni;
    
 //constructor
    
    public Persona(String dni, String nombre, String apellido, int edad, double peso)
    {
    this.dni=dni;
    this.apellido=apellido;
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

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
