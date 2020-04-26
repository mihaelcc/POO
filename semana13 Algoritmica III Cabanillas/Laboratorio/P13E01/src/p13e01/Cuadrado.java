/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13e01;

/**
 *
 * @author michael
 */
public class Cuadrado extends Figura{
    protected double lado;
    
    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado=lado;}
    
    public double area(){return lado*lado;}
    public double perimetro(){return 4*lado;}
    
    
    
}
