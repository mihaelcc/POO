/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E04;



/**
 *
 * @author usuario
 */
public class EmpleadoVendedor extends Empleado{
    protected double montovendido, tasacomision;

    public EmpleadoVendedor(double montovendido, double tasacomision) {
        super();
        this.montovendido = montovendido;
        this.tasacomision = tasacomision;
    }
    public double ingreso(){
        return getMontovendido()*getTasacomision();
    }

    @Override
    public double bonificacion() {
        double b=0;
        if(getMontovendido()<1000){
            b=0;
        }
        if(getMontovendido()<5000){
            b=ingreso()*0.05;
        }
        if(getMontovendido()>=5000){
            b=ingreso()*0.10;
        }
        return b;
    }

    @Override
    public double descuento() {
        double d=0;
       if(ingreso()<1000){
           d=ingreso()*0.11;
       }else{
           d=ingreso()*0.15;
       }
       return d;
    }

    public double getMontovendido() {
        return montovendido;
    }

    public void setMontovendido(double montovendido) {
        this.montovendido = montovendido;
    }

    public double getTasacomision() {
        return tasacomision;
    }

    public void setTasacomision(double tasacomision) {
        this.tasacomision = tasacomision;
    }
}
