/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E05;



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
        	public Figura getFigura(){
		return a.get(0);
}
	public int getN(){
            return a.size();
}
	public void elimina(int i){
		a.remove(i);
}
        public double AreaMayor(){
            double m=a.get(0).area();
            for (int i = 1; i < getN(); i++) {
            if (getFigura(i).area() > m) {
                m = getFigura(i).area();
            }
        }
        return m;
        }
         public double AreaMenor(){
            double m=a.get(0).area();
            for (int i = 1; i < getN(); i++) {
            if (getFigura(i).area() < m) {
                m = getFigura(i).area();
            }
        }
        return m;
        }
          public double areaPromedio() {
        double s = 0;
        for (int i = 0; i < getN(); i++) {
            s += getFigura(i).area();
        }
        return s / getN();
    }
           public double parametroMayor(){
            double m=a.get(0).parametro();
            for (int i = 1; i < getN(); i++) {
            if (getFigura(i).parametro() > m) {
                m = getFigura(i).parametro();
            }
        }
        return m;
        }
         public double parametroMenor(){
            double m=a.get(0).parametro();
            for (int i = 1; i < getN(); i++) {
            if (getFigura(i).parametro() < m) {
                m = getFigura(i).parametro();
            }
        }
        return m;
        }
          public double parametroPromedio() {
        double s = 0;
        for (int i = 0; i < getN(); i++) {
            s += getFigura(i).parametro();
        }
        return s / getN();
    }

        
}