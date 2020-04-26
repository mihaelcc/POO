/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package p05e01;


public class ArregloProductos {
    //atributos
    private Producto a[];
    private int n;
    private final int tam=50;
    //constructor
    public ArregloProductos(){
     a= new Producto[tam];
     n=0;
    }
    
    //metodos de Administracion    
    public void agrega(Producto nuevo){
        a[n]=nuevo;    
        n++;
    }
    public int getN(){ 
        return n;
    }
    public void reemplaza(Producto nuevo,int i){
        a[i]=nuevo;
    }
    
    public Producto getProducto(int p){
        return a[p];
    }
    public int busca(String codigo){
        for(int i=0;i<n;i++){
            if(a[i].getCodigo().equals(codigo))
                return i;
        }
        return -1;
    }
    public void elimina(int p){
        for(int i=p;i<n-1;i++)
            a[i]=a[i+1];
        n--;
    }
    public double PrecioPromedio(){
        double suma=0;
        for(int i=0;i<n;i++){
            suma+=a[i].getPrecio();
        }
        return suma/n;
    }
    public double MayorPrecio(){
        double m=a[0].getPrecio();
        for(int i=1;i<n;i++){
            if(a[i].getPrecio()>m)
                m=a[i].getPrecio();
        }
        return m;
    }
}
