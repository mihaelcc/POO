/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E02;


import java.util.ArrayList;

/**
 *
 * @author usuario
 */

public class ArregloFiguras{
	protected ArrayList <Figura> a;
      
public ArregloFiguras(){
		a = new ArrayList<Figura>();
      }  
	// métodos de administración
	public void agrega(Figura f){
		a.add(f);
}
	public Figura getFigura(int i){
		return a.get(i);
}
	public int getN(){
            return a.size();
}
	public void elimina(int i){
		a.remove(i);
}

        
}