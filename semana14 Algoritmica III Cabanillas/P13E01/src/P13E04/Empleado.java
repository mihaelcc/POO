/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E04;



/**
 *
 * @author usuario
 */
public abstract class  Empleado  {
   

    
    
    public abstract double ingreso();
    public abstract double bonificacion();
    public abstract double descuento();

     public String info(){
         return "ingreso\t"+ingreso()+"\n"+
                 "Bonificacion\t"+bonificacion()+"\n"+
                 "descuento\t"+descuento();
     }
  
    
}
