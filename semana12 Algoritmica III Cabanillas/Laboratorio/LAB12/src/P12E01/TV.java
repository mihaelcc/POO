package P12E01;

public class TV {

    protected String serie;
    protected int marca, tamaño;
    protected double precio;

    public TV(String serie, int marca, int tamaño, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getMarca() {
        return marca;
    }

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

    public double preciosoles(double tc) {
        return precio * tc;
    }

    public String Nombremarca() {
        switch (marca) {
            case 1:
                return "Sony";
            case 2:
                return "LG";
            case 3:
                return "Samsung";
            case 4:
                return "Panasonic";
            default:
                return "otros";
        }
    }
}