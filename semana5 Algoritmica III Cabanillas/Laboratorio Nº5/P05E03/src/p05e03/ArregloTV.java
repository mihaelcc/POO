/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p05e03;

/**
 *
 * @author michael
 */
public class ArregloTV {
    
    private TV tv[];
    private int n;
    private final int tam=50;
    public ArregloTV(){
     tv= new TV[tam];
     n=0;
    }
    public void agrega(TV nuevo){
        tv[n]=nuevo;
        n++;
    }
    public int getN(){
        return n;
    }
    public TV getTV(int p){
        return tv[p];
    }
    public int busca(String serie){
        for(int i=0;i<n;i++){
            if(tv[i].getSerie().equals(serie))//equals es igual a == es solo para cadenas(string)
                return i;
        }
        return -1;
    }
    public void elimina(int p){
        for(int i=p;i<n-1;i++)//el for cuando no tiene llaves solo hace una instruccion
            tv[i]=tv[i+1];
        n--;
    }
    public void reemplaza(TV nuevo,int i){
        tv[i]=nuevo;
    }
    public double PrecioPromedio(){
        double suma=0;
        for(int i=0;i<n;i++){
            suma+=tv[i].getPrecio();
        }
        return suma/n;
    }
    public double MayorPrecio(){
        double m=tv[0].getPrecio();
        for(int i=1;i<n;i++){
            if(tv[i].getPrecio()>m)
                m=tv[i].getPrecio();
        }
        return m;
    }
    
    
}
