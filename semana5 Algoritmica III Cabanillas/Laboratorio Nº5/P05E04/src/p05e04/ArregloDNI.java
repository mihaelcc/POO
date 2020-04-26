/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p05e04;

/**
 *
 * @author michael
 */
public class ArregloDNI {
    
     //atributos
    private DNI a[];
    private int n;
    private final int tam=50;
    //constructor
    public ArregloDNI(){
     a= new DNI[tam];
     n=0;
    }
    
    //metodos de Administracion    
    public void agrega(DNI nuevo){
        a[n]=nuevo;    
        n++;
    }
    public int getN(){ 
        return n;
    }
    public void reemplaza(DNI nuevo,int i){
        a[i]=nuevo;
    }
    
    public DNI getDNI(int p){
        return a[p];
    }
    public int busca(String numero){
        for(int i=0;i<n;i++){
            if(a[i].getNumero().equals(numero))
                return i;
        }
        return -1;
    }
    public void elimina(int p){
        for(int i=p;i<n-1;i++)
            a[i]=a[i+1];
        n--;
    }
    public double PesoPromedio(){
        double suma=0;
        for(int i=0;i<n;i++){
            suma+=a[i].getDueño().getPeso();
        }
        return suma/n;
    }
    public double MayorPeso(){
        double m=a[0].getDueño().getPeso();
        for(int i=1;i<n;i++){
            if(a[i].getDueño().getPeso()>m)
                m=a[i].getDueño().getPeso();
        }
        return m;
    }
    
    
}
