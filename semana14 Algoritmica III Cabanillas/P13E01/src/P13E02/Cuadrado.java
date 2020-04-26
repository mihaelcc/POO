/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E02;


/**
 *
 * @author usuario
 */
public class Cuadrado extends Figura{
     protected double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }
public double area(){
    return getLado()*getLado();
}
      public  double parametro(){
          return 4*getLado();
      }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}

