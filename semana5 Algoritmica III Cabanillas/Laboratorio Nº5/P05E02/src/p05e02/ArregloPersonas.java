/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p05e02;

/**
 *
 * @author michael
 */
public class ArregloPersonas {
    
    
    private Persona a[];
    private int n;
    private final int tam=50;
    public ArregloPersonas(){
     a= new Persona[tam];
     n=0;
    }
    public void agrega(Persona nuevo){
        a[n]=nuevo;
        n++;
    }
    public int getN(){
        return n;
    }
    public Persona getPersona(int p){
        return a[p];
    }
    public int busca(String dni){
        for(int i=0;i<n;i++){
            if(a[i].getDni().equals(dni))//equals es igual a == es solo para cadenas(string)
                return i;
        }
        return -1;
    }
    public void elimina(int p){
        for(int i=p;i<n-1;i++)//el for cuando no tiene llaves solo hace una instruccion
            a[i]=a[i+1];
        n--;
    }
    public void reemplaza(Persona nuevo,int i){
        a[i]=nuevo;
    }
    public double PesoPromedio(){
        double suma=0;
        for(int i=0;i<n;i++){
            suma+=a[i].getPeso();
        }
        return suma/n;
    }
    public double MayorPeso(){
        double m=a[0].getPeso();
        for(int i=1;i<n;i++){
            if(a[i].getPeso()>m)
                m=a[i].getPeso();
        }
        return m;
    }
    
    
    
}
