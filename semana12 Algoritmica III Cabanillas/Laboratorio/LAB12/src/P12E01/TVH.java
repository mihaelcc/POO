package P12E01;

public class TVH extends TV {

    private int origen;
    private int tecnologia;

    public TVH(String serie, int marca, int tamaño, double precio, int origen, int tecnologia) {
        super(serie, marca, tamaño, precio);
        this.tecnologia = tecnologia;
        this.origen = origen;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String nombreOrigen() {
        switch (origen) {
            case 1:
                return "Nacional";
            case 2:
                return "Americano";
            case 3:
                return "Japonés";
            case 4:
                return "Koreano";
            case 5:
                return "Chino";
            default:
                return "Otro";
        }
    }

    public String nombreTecnologia() {
        switch (tecnologia) {
            case 1:
                return "Tradicional";
            case 2:
                return "LCD";
            case 3:
                return "Plasma";
            default:
                return "Digital";
        }
    }
}
