
package p13e04;

public class EmpleadoVendedor extends Empleado{

    protected double montoVendido,porcentajeComision;

    public EmpleadoVendedor(String nombre, String apellido, String dni,double montoVendido, double porcentajeComision) {
        super(nombre, apellido, dni);
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
    }
    
    @Override
    public double ingreso() {
        return montoVendido * porcentajeComision;
    }

    @Override
    public double bonificacion() {
         if(montoVendido<1000){
             return 0;
         }else{
             if(montoVendido<5000){
                 return ingreso()*0.05;
             }else{
                 return 0;
             }
         }
    }

    @Override
    public double descuento() {
        if(montoVendido>=5000)
            return 0.1 * ingreso();
        else
            return -1;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    
    
}
