/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p02e03;

public class TV {
    private String serie;
    private String smarca;
    private int tamaño;
    private int marca;
    private double precio;
    
    //constructor
    public TV (String serie, int marca, int tamaño, double precio)
    {this.marca=marca;
    this.precio=precio;
    this.tamaño=tamaño;
    this.serie=serie;
    }
    
    
    
   
  /*  
    public String getMarca(){
        switch(marca)
        {case 1: return "Panasonic";
        case 2: return "Samsumg"   ;
        case 3: return "LG"    ;
        default: return "otro";
        }
        }
    */

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        switch(marca)
        {case 1: return "Panasonic";
        case 2: return "Samsumg"   ;
        case 3: return "LG"    ;
        default: return "otro";
    }

}

    public void setMarca(int marca) {
        this.marca = marca; 
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    }
