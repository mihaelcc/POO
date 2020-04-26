/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13e01;

/**
 *
 * @author michael
 */
public abstract class Figura {
    //atributos
    protected String nombre;
    
   //constructor
    public Figura (String nombre){
        this.nombre=nombre;
    }
    
    //metodos abstractos
    public abstract double area();
    public abstract double perimetro();
    //metodo NO abstracto
    public String info(){
        return "Figura\t "+nombre+"\n"+
                "Area\t: "+area()+"\n"+
                "Preimetro\t: "+perimetro();
        
    }
}
