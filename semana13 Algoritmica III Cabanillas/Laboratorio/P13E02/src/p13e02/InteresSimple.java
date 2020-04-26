package p13e02;

/**
 *
 * @author michael
 */
public class InteresSimple extends Interes{
    
    
    
    public InteresSimple(String nombre, int CapitalInicial, double tasaInteres, int numeroAños){
    super(nombre, CapitalInicial, tasaInteres, numeroAños );
    }
    
    public double capitalFinal(){
    return getCapitalInicial()*(1+getTasaInteres()*getNumeroAños());
    };
    
}
