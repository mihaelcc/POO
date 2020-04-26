/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p01e03;

public class TV {
    
    String serie,smarca;
    int tamaño,marca;
    double precio;
    
    public String getSerie(){return serie;}
    
    public String getMarca(){
        switch(marca)
        {case 1: return "Panasonic";
        case 2: return "Samsumg"   ;
        case 3: return "LG"    ;
        default: return "otro";
        }
        }
    
    public int getTamaño(){return tamaño;}
    public double getPrecio(){return precio;}
    
    public void setSerie(String s){serie=s;}
    public void setMarca(int m){marca=m;}
    public void setTamaño(int t){tamaño=t;}
    public void setPrecio(double p){precio=p;}
    }
