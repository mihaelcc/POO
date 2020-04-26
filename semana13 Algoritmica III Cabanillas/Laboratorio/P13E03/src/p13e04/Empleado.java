
package p13e04;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String dni;

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
   
    //metodos abstractos
    public abstract double ingreso();
    public abstract double bonificacion();
    public abstract double descuento();
   
    //metodos no abstractos
    public double sueldoNeto(){
        return ingreso() + bonificacion() - descuento();
    }
    
    public String info(){
        return "\nNombre :\t" + getNombre() +
               "\nApellido :\t" + getApellido() +
               "\nDNI :\t" + getDni() +
               "\n\n---------Datos Extras-------"+
               "\nIngresos :\t" + ingreso() +
               "\nBonificación :\t" + bonificacion() +
               "\nDescuentos :\t" + descuento() +
               "\nSueldo Neto :\t" + sueldoNeto()  ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
}
