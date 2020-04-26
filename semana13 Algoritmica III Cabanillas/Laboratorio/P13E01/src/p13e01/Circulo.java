/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13e01;

/**
 *
 * @author michael
 */
public class Circulo extends Figura{
    protected double radio;
	public Circulo(double radio){
		super("Circulo");
		this.radio = radio;
        }
	public double area(){ return Math.PI * radio * radio;}
	public double perimetro(){ return 2 * Math.PI * radio;}
}

