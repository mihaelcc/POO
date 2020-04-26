package P12E02;

public class PersonaH extends Persona {

    private String email;
    private String foto;

    public PersonaH(String dni, String nombres, String apellidos, int edad, double peso, String email, String foto) {
        super(dni, nombres, apellidos, edad, peso);
        this.email = email;
        this.foto = foto;
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
