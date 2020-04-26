/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p06e01;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class ArregloProductos {
    private ArrayList <Producto> a ;
    
    public ArregloProductos(){
        a =new ArrayList<Producto>();
    }
    
    public int getN() {
        return a.size();
    }
    public void agrega(Producto p){
        a.add(p);
    }
    public Producto getProducto(int i){
        return a.get(i);
    }
    public void actualiza(Producto p, int i){
        a.set(i, p);
    }
    public int busca(String codigo){
        for(int i=0; i<getN(); i++){
            if(getProducto(i).getCodigo().equals(codigo))
                return i;
        }
        return -1;
    }
    
     public double disminuirValor(Producto p,double ap,double an,double dis){
        double m=0;
       
            if((ap<p.getPrecio())&&(p.getPrecio()<an))
            {
             
                m=p.getPrecio()-dis; }
            
             else{
                 m=p.getPrecio();
            }
            
           
        return m;
        
    }
     
     
    public String busquedaDes(Producto p,String c){
       String a="";
               if( p.getDescripcion().equals(c) )
                
             a= p.getDescripcion();
               
               
              return a; 
       //       a++;
         //   String [] array = new String[a];
         //  array [a]=p.getDescripcion();
     }
     
    
    public String busquedaCod(Producto p,String c){
       String a="";
               if( p.getDescripcion().equals(c) )
                
             a= p.getCodigo();
               
               
              return a; 
    }
    
    
     public double busquedaPre(Producto p,String c){
       double a=0;
         if( p.getDescripcion().equals(c) ){
                 
                 a= p.getPrecio();
               }
              return a; 
    }
     
    public double aumentarValor(Producto p,double ap,double an,double aumen){
        double m=0;
            if((ap<p.getPrecio())&&(p.getPrecio()<an))
            {
             
                m=p.getPrecio()+aumen;}
            else{
                 m=p.getPrecio();
            }
        return m;
        
    }
    public double Aumentar15(Producto p){
        return p.getPrecio()*1.15;
    }
    public int Menores(){
        int m=1;
        for(int i=1; i<getN(); i++){
            if(getProducto(i).getPrecio()<precioPromedio())
                m++;
        }
        return m;
    }
    
    public void elimina(int p){
       a.remove(p);
    }
    public double mayorPrecio(){
        double m=a.get(0).getPrecio();
        for(int i=1; i<getN(); i++){
            if(getProducto(i).getPrecio()>m)
                m =getProducto(i).getPrecio();
        }
        return m;
    }
    public double menorPrecio(){
        double m=a.get(0).getPrecio();
        for(int i=1; i<getN(); i++){
            if(getProducto(i).getPrecio()<m)
                m =getProducto(i).getPrecio();
        }
        return m;
    }
    public double precioPromedio(){
        double s=0;
        for(int i=1; i<getN(); i++){
            s +=getProducto(i).getPrecio();
        }
        return s/getN();
    }
    public ArrayList<Producto> getA() {
        return a;
    }

}
