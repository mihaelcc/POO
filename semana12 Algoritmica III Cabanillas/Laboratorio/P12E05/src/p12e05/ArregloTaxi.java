/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e05;

import java.util.ArrayList;

/**
 *
 * @author Pablito
 */
public class ArregloTaxi {
    
    protected ArrayList<TAXI> at;
    
    public ArregloTaxi(){
        at=new ArrayList<>();
    }
       
    public void agrega(TAXI p){
    	at.add(p);
    }
    
    public void agrega(String matricula, String modelo, String foto, double potencia,
            int numero_licencia){
 	at.add(new TAXI(matricula,modelo,foto,potencia,numero_licencia));
    }
    
    public int getN(){
        return at.size();
    }
    
    public TAXI getTaxi(int i){
        return at.get(i);
    }
    
    public TAXI getTaxi(){
        return at.get(0);
    }
    
    public TAXI busca(String matricula){
        for(int i=0; i<getN(); i++){
            if(getTaxi(i).getMatricula().equals(matricula)){
                return getTaxi(i);
            }
        }
        return null;
    }
    
    public int busca1(String matricula){
        for(int i=0; i<getN(); i++){
            if(getTaxi(i).getMatricula().equals(matricula)){
                return i;
            }
        }
        return -1;
    }
    
    public void modifica(TAXI a,int i){
        at.set(i, a);
    }
        
    public void elimina(int i){
        at.remove(i);
    }
    
    public void elimina(String matricula){
        if(busca(matricula)!=null) {
            at.remove(busca(matricula));
        }
    }
    
    public void elimina(TAXI t){
        at.remove(t);
    }
    
    public double mayorPotencia(){
        double m = getTaxi(0).getPotencia();
        for(int i=1; i<getN(); i++){
            if(getTaxi(i).getPotencia()>m){
                m = getTaxi(i).getPotencia();
            }
        }
        return m;
    }
    
    public double menorPotencia(){
        double m = getTaxi(0).getPotencia();
        for(int i=1; i<getN(); i++){
            if(getTaxi(i).getPotencia()<m){
                m = getTaxi(i).getPotencia();
            }
        }
        return m;
    }
    
    public double potenciaPromedio(){
        double s = 0;
        for(int i=0; i<getN(); i++){
            s += getTaxi(i).getPotencia();
        }
        return s/getN();
    }    
}
