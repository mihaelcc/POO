package P10E01;

public class TVH extends TV {

    protected int origen;
    protected int tecnologia;

    public TVH(String serie, int marca, int pulgadas, double precio, int origen, int tecnologia) {
        super(serie, marca, pulgadas, precio);
        this.origen = origen;
        this.tecnologia = tecnologia;
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

    public String nombreorigen() {
        switch (origen) {
            case 1:
                return "Nacional";
            case 2:
                return "Americano";
            case 3:
                return "Japones";
            case 4:
                return "Koreano";
            case 5:
                return "Chino";
            default:
                return "Otro";
        }
    }

    public String nombretecnologia() {
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
