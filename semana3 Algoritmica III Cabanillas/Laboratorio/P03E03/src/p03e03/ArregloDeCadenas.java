/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p03e03;

/**
 *
 * @author michael
 */
public class ArregloDeCadenas {
    
    // atributos 
    private String a[]; // arreglo de reales 
    private int n; // numero de reales en el arreglo 
    private int tamaño; // tamaño de valor dinámico 
    
    // constructor 
    public ArregloDeCadenas(int tamaño){ 
        a = new String[tamaño];
        n = 0; 
        this.tamaño=tamaño;
    }

    /**
     * @return the a
     */
    public String[] getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String[] a) {
        this.a = a;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
   // métodos de administración
    public void agrega(String num){
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
    public int busca(String num){
        for(int i=0; i<n; i++){
            if(a[i] == null ? num == null : a[i].equals(num))
                return i;
            }
        return -1;
        }
        
    public String getNum(int i){
        return a[i];
        }
    
    /*public double sumaTodo(){
        double suma=0;
        for(int i=0; i<n; i++){
          suma += a[i];
          }
        return suma;
        }
    
    public double promedio(){
        return sumaTodo()/n;
        }
    
    public double elMayor(){
        double m=a[0];
        for(int i=0; i<n; i++){
            if(a[i]>m)
                m=a[i];
          }
        return m;
        }
        
    public double elMenor(){
        double m=a[0];
        for(int i=0; i<n; i++){
        if(a[i]<m)
            m=a[i];
        }
        return m;
        } 
    */
}
