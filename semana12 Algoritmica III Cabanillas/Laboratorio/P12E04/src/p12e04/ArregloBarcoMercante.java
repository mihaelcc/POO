/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e04;

import java.util.ArrayList;

/**
 *
 * @author Pablito
 */
public class ArregloBarcoMercante {
    
    protected ArrayList<BarcoMercante> abm;
    
    public ArregloBarcoMercante(){
        abm=new ArrayList<>();
    }
       
    public void agrega(BarcoMercante p){
    	abm.add(p);
    }
    
    public void agrega(String nombre, String flotabilidad, double velocidad,
            int carga_util, String mercancia, String foto){
 	abm.add(new BarcoMercante(nombre,flotabilidad,velocidad,carga_util,
                mercancia,foto));
    }
    
    public int getN(){
        return abm.size();
    }
    
    public BarcoMercante getBarcoMercante(int i){
        return abm.get(i);
    }
    
    public BarcoMercante getBarcoMercante(){
        return abm.get(0);
    }
    
    public BarcoMercante busca(String nombre){
       for(int i=0; i<getN(); i++){
           if(getBarcoMercante(i).getNombre().equals(nombre)){
               return getBarcoMercante(i);
           }
        }
        return null;
    }
    
    public int busca1(String nombre){
        for(int i=0; i<getN(); i++){
            if(getBarcoMercante(i).getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }
    
    public void modifica(BarcoMercante b,int i){
        abm.set(i, b);
    }
        
    public void elimina(int i){
        abm.remove(i);
    }
    
    public void elimina(String nombre){
        if(busca(nombre)!=null) {
            abm.remove(busca(nombre));
        }
    }
    
    public void elimina(BarcoMercante bm){
        abm.remove(bm);
    }
    
    public double mayorVelocidad(){
        double m = getBarcoMercante(0).getVelocidad();
        for(int i=1; i<getN(); i++){
            if(getBarcoMercante(i).getVelocidad()>m){
                m = getBarcoMercante(i).getVelocidad();
            }
        }
        return m;
    }
    
    public double menorVelocidad(){
        double m = getBarcoMercante(0).getVelocidad();
        for(int i=1; i<getN(); i++){
            if(getBarcoMercante(i).getVelocidad()<m){
                m = getBarcoMercante(i).getVelocidad();
            }
        }
        return m;
    }
    
    public double velocidadPromedio(){
        double s = 0;
        for(int i=0; i<getN(); i++){
            s += getBarcoMercante(i).getVelocidad();
        }
        return s/getN();
    }
}
