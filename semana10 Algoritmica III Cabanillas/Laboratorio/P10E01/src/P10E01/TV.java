package P10E01;

public class TV {

    protected String serie;
    protected int marca;
    protected int pulgadas;
    protected double precio;

    public TV(String serie, int marca, int pulgadas, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.pulgadas = pulgadas;
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

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String nombremarca() {
        switch (marca) {
            case 1:
                return "Sony";
            case 2:
                return "LG";
            case 3:
                return "Samsung";
            default:
                return "Panasonic";
        }
    }
}
