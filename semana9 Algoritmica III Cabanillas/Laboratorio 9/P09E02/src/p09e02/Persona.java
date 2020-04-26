
package p09e02;

public class Persona {
    protected String nombres;
    protected String apellidos;
    protected double peso;
    protected int edad;

    public Persona(String nombres, String apellidos, double peso, int edad){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.peso=peso;
        this.edad=edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
