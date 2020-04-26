

package p09e01;


public class TV {

    private String serie;
    private int marca, tamaño;
    private double precio;

    public TV(String serie, int marca, int tamaño, double precio){
        this.serie=serie;
        this.marca=marca;
        this.tamaño=tamaño;
        this.precio=precio;
    }

    public String getSerie() {return serie;}

    public void setSerie(String serie) {this.serie = serie;}

    public int getMarca() {return marca;}

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

     public String nombreMarca(){
        switch(marca)
        {
            case 0: return "Sony";
            case 1: return "LG";
            case 2: return "Samsung";
            case 3: return "Panasonic";
            default: return "Otro";
        }
    }

     public double precioSoles(double tc){
         return precio * tc;
     }



}
