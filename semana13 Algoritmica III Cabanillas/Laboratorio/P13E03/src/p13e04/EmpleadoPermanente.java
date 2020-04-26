package p13e04;

public class EmpleadoPermanente extends Empleado{

    protected double sueldoBasico;
    protected String afiliacion;

    public EmpleadoPermanente(String nombre, String apellido, String dni,double sueldoBasico, String afiliacion) {
        super(nombre, apellido, dni);
        this.sueldoBasico = sueldoBasico;
        this.afiliacion = afiliacion;
    }
    
    @Override
    public double ingreso() {
        return sueldoBasico;
    }

    @Override
    public double bonificacion() {
       return 0;
    }

   
    @Override
    public double descuento() {
        if(afiliacion.equals("AFP"))
            return  ingreso() * 0.15;
        else
            return  ingreso() * 0.11;
    }

    
    
    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    
    
}
