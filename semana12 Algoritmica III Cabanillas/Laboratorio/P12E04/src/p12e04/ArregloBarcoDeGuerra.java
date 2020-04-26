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
public class ArregloBarcoDeGuerra {
    
    protected ArrayList<BarcoDeGuerra> abg;
    
    public ArregloBarcoDeGuerra(){
        abg=new ArrayList<>();
    }
       
    public void agrega(BarcoDeGuerra p){
    	abg.add(p);
    }
    
    public void agrega(String nombre, String flotabilidad, double velocidad,
            String artillería, String foto, double alcance, int tripulación){
 	abg.add(new BarcoDeGuerra(nombre,flotabilidad,velocidad,artillería,
                foto,alcance,tripulación));
    }
    
    public int getN(){
        return abg.size();
    }
    
    public BarcoDeGuerra getBarcoDeGuerra(int i){
        return abg.get(i);
    }
    
    public BarcoDeGuerra getBarcoDeGuerra(){
        return abg.get(0);
    }
    
    public BarcoDeGuerra busca(String nombre){
       for(int i=0; i<getN(); i++){
           if(getBarcoDeGuerra(i).getNombre().equals(nombre)){
               return getBarcoDeGuerra(i);
           }
        }
        return null;
    }
    
    public int busca1(String nombre){
        for(int i=0; i<getN(); i++){
            if(getBarcoDeGuerra(i).getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }
    
    public void modifica(BarcoDeGuerra b,int i){
        abg.set(i, b);
    }
        
    public void elimina(int i){
        abg.remove(i);
    }
    
    public void elimina(String nombre){
        if(busca(nombre)!=null) {
            abg.remove(busca(nombre));
        }
    }
    
    public void elimina(BarcoDeGuerra bg){
        abg.remove(bg);
    }
    
    public double mayorVelocidad(){
        double m = getBarcoDeGuerra(0).getVelocidad();
        for(int i=1; i<getN(); i++){
            if(getBarcoDeGuerra(i).getVelocidad()>m){
                m = getBarcoDeGuerra(i).getVelocidad();
            }
        }
        return m;
    }
    
    public double menorVelocidad(){
        double m = getBarcoDeGuerra(0).getVelocidad();
        for(int i=1; i<getN(); i++){
            if(getBarcoDeGuerra(i).getVelocidad()<m){
                m = getBarcoDeGuerra(i).getVelocidad();
            }
        }
        return m;
    }
    
    public double velocidadPromedio(){
        double s = 0;
        for(int i=0; i<getN(); i++){
            s += getBarcoDeGuerra(i).getVelocidad();
        }
        return s/getN();
    }
}
