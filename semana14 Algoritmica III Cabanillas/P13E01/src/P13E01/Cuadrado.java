/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E01;

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
    return lado*lado;
}
      public  double parametro(){
          return 4*lado;
      }
    
}

