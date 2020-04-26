package p13e02;

/**
 *
 * @author michael
 */
public abstract class Interes {
    
    //atributos
    private String nombre;
    private int CapitalInicial;
    private double tasaInteres;
    private int numeroAños;
    
   //constructor
    public Interes (String nombre, int CapitalInicial, double tasaInteres, int numeroAños){
        this.nombre=nombre;
        this.CapitalInicial=CapitalInicial;
        this.tasaInteres=tasaInteres;
        this.numeroAños=numeroAños;
    }
    
    //metodos abstractos
    public abstract double capitalFinal();
    
    //metodo NO abstracto
    public String info(){
        return "Interes\t "+getNombre()+"\n"+
               "Capital inicial\t "+getCapitalInicial()+"\n"+
                "tasa interes\t "+getTasaInteres()+"\n"+
                "numero de años\t "+getNumeroAños()+"\n"+
                
                "Capital Final\t: "+capitalFinal();
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the CapitalInicial
     */
    public int getCapitalInicial() {
        return CapitalInicial;
    }

    /**
     * @param CapitalInicial the CapitalInicial to set
     */
    public void setCapitalInicial(int CapitalInicial) {
        this.CapitalInicial = CapitalInicial;
    }

    /**
     * @return the tasaInteres
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * @param tasaInteres the tasaInteres to set
     */
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    /**
     * @return the numeroAños
     */
    public int getNumeroAños() {
        return numeroAños;
    }

    /**
     * @param numeroAños the numeroAños to set
     */
    public void setNumeroAños(int numeroAños) {
        this.numeroAños = numeroAños;
    }

    
}
