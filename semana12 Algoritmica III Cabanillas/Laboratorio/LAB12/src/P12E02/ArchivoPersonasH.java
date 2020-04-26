package P12E02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArchivoPersonasH extends ArregloPersonasH {

    protected String nombre;

    public ArchivoPersonasH(String nombre) {
        super();
        this.nombre = nombre;
        lee();
    }

    public void lee() {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, "/");
                String dni = st.nextToken();
                String nombres = st.nextToken();
                String apellidos = st.nextToken();
                int edad = Integer.parseInt(st.nextToken());
                double peso = Double.parseDouble(st.nextToken());
                String email = st.nextToken();
                String foto = st.nextToken();
                agrega(dni, nombres, apellidos, edad, peso, email, foto);
                linea = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
        }
    }

    public void graba() {
        try {
            FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < getN(); i++) {
                PersonaH t = getPersonaH(i);
                pw.println(t.getDni() + "/" + t.getNombres() + "/" + t.getApellidos() + "/" + t.getEdad() + "/" + t.getPeso() + "/" + t.getEmail() + "/" + t.getFoto());
            }
            pw.close();
        } catch (Exception ex) {
        }
    }
}
