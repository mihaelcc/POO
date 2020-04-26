/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E04;



/**
 *
 * @author usuario
 */
public class EmpleadoPermanente extends Empleado{
    protected double sueldo;
    protected int afiliacion;

    public EmpleadoPermanente(double sueldo, int afiliacion) {
        super();
        this.sueldo = sueldo;
        this.afiliacion = afiliacion;
    }
    

    @Override
    public double ingreso() {
       double i=0;
       i=getSueldo();
       return i;
    }

    @Override
    public double bonificacion() {
        double b=0;
        
        return b;
    }

    @Override
    public double descuento() {
        double d=0;
       if(afiliciacionx()=="afp"){
           d=getSueldo()*0.15;
           
       }else{
           d=getSueldo()*0.11;
       }
       return d;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(int afiliacion) {
        this.afiliacion = afiliacion;
    }
    
    public String afiliciacionx(){
        switch(afiliacion){
            case 1: return "afp";
            default:return "snp";
        }
    }
}
