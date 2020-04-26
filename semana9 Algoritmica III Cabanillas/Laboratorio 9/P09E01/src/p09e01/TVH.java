

package p09e01;


public class TVH extends TV { // EXTENDS APLICA LA HERENCIA
    protected int origen, tecnologia;

    public TVH(String serie, int marca, int tamaño, double precio, int origen, int tecnologia){
        super(serie, marca, tamaño, precio);
        this.origen=origen;
        this.tecnologia=tecnologia;
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

    // METODOS ADICIONALES PARA EL COMBO-BOX

    public String nombreOrigen(){
        switch(origen)
        {
            case 0: return "Nacional";
            case 1: return "Americano";
            case 2: return "Japones";
            case 3: return "Coreano";
            case 4: return "Chino";
            default: return "otro";
        }
    }
    public String nombreTecnologia(){
        switch(tecnologia)
        {
            case 0: return "Tradicional";
            case 1: return "LCD";
            case 2: return "Plasma";
            default: return "Digital";
        }
    }
}
