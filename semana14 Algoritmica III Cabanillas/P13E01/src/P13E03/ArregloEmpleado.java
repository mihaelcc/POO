/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E03;

import P13E01.Figura;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ArregloEmpleado {
    protected ArrayList <Empleado> a;
      
public ArregloEmpleado(){
		a = new ArrayList<Empleado>();
      }  
	// métodos de administración
	public void agrega(Empleado f){
		a.add(f);
}
	public Empleado getEmpleado(int i){
		return a.get(i);
}
	public int getN(){
            return a.size();
}
	public void elimina(int i){
		a.remove(i);
}
}
