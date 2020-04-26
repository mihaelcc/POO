/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p03e01;

/**
 *
 * @author michael
 */
public class ArregloDeEnteros {
    
    private int a[]; // arreglo de enteros
    private int n; // numero de enteros en el arreglo
    private final int tamaño = 30; // tamaño de valor fijo
    
    // constructor
    public ArregloDeEnteros(){
        a = new int[tamaño];
        n = 0;
        }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getTamaño() {
        return tamaño;
        
    }
    
    // métodos de administración
    public void agrega(int num){
        if(n<tamaño){
            a[n] = num;
            n++;
            }
        }
    
    public void elimina(int p){
        for(int i=p ; i<n-1; i++)
            a[i] = a[i+1];
        n--;
        }
    public int busca(int num){
        for(int i=0; i<n; i++){
            if(a[i]==num)
                return i;
            }
        return -1;
        }
        
    public int getNum(int i){
        return a[i];
        }
    
    public int sumaTodo(){
        int suma=0;
        for(int i=0; i<n; i++){
          suma += a[i];
          }
        return suma;
        }
    
    public double promedio(){
        return sumaTodo()/n;
        }
    
    public int elMayor(){
        int m=a[0];
        for(int i=0; i<n; i++){
            if(a[i]>m)
                m=a[i];
          }
        return m;
        }
        
    public int elMenor(){
        int m=a[0];
        for(int i=0; i<n; i++){
        if(a[i]<m)
            m=a[i];
        }
        return m;
        }
    }
    
    
    
    

