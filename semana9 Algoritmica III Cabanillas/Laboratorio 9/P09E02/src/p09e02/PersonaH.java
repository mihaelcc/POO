

package p09e02;


public class PersonaH extends Persona {

    private String dni, email, foto;

    public PersonaH(String nombres, String apellidos, double peso, int edad, String dni, String email, String foto){
        super(nombres, apellidos, peso, edad);
        this.dni=dni;
        this.email=email;
        this.foto=foto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
}
