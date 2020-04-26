/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E05;





/**
 *
 * @author usuario
 */
public abstract class  Figura {
    protected String nombre;
    
    public Figura(String nombre){
        this.nombre=nombre;
    }
    
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public abstract double area();
      public abstract double parametro();
      public String info(){
          return "figura\t"+nombre+"\n"+
                  "Area\t"+area()+"\n"+
                  "Preimetro\t"+parametro();
      }
}
