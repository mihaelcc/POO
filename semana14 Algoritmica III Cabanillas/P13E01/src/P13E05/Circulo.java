/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E05;





/**
 *
 * @author usuario
 */
public class Circulo extends Figura{
    protected double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }
public double area(){
    return Math.PI*getRadio()*getRadio();
}
      public  double parametro(){
          return 2*Math.PI*getRadio();
      }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    
}
