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
public class ArregloAutobus {
    
    protected ArrayList<AUTOBUS> aa;
    
    public ArregloAutobus(){
        aa=new ArrayList<>();
    }
       
    public void agrega(AUTOBUS p){
    	aa.add(p);
    }
    
    public void agrega(String matricula, String modelo, String foto, double potencia,
            int numero_plazas){
 	aa.add(new AUTOBUS(matricula,modelo,foto,potencia,numero_plazas));
    }
    
    public int getN(){
        return aa.size();
    }
    
    public AUTOBUS getAutobus(int i){
        return aa.get(i);
    }
    
    public AUTOBUS getAutobus(){
        return aa.get(0);
    }
    
    public AUTOBUS busca(String matricula){
        for(int i=0; i<getN(); i++){
            if(getAutobus(i).getMatricula().equals(matricula)){
                return getAutobus(i);
            }
        }
        return null;
    }
    
    public int busca1(String matricula){
        for(int i=0; i<getN(); i++){
            if(getAutobus(i).getMatricula().equals(matricula)){
                return i;
            }
        }
        return -1;
    }
    
    public void modifica(AUTOBUS a,int i){
        aa.set(i, a);
    }
        
    public void elimina(int i){
        aa.remove(i);
    }
    
    public void elimina(String matricula){
        if(busca(matricula)!=null) {
            aa.remove(busca(matricula));
        }
    }
    
    public void elimina(AUTOBUS ab){
        aa.remove(ab);
    }
    
    public double mayorPotencia(){
        double m = getAutobus(0).getPotencia();
        for(int i=1; i<getN(); i++){
            if(getAutobus(i).getPotencia()>m){
                m = getAutobus(i).getPotencia();
            }
        }
        return m;
    }
    
    public double menorPotencia(){
        double m = getAutobus(0).getPotencia();
        for(int i=1; i<getN(); i++){
            if(getAutobus(i).getPotencia()<m){
                m = getAutobus(i).getPotencia();
            }
        }
        return m;
    }
    
    public double potenciaPromedio(){
        double s = 0;
        for(int i=0; i<getN(); i++){
            s += getAutobus(i).getPotencia();
        }
        return s/getN();
    }    
}
