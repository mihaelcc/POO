package P12E01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArchivoTVH extends ArregloTVH {

    protected String nombre;

    public ArchivoTVH(String nombre) {
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
                String serie = st.nextToken();
                int marca = Integer.parseInt(st.nextToken());
                int tamaño = Integer.parseInt(st.nextToken());
                double precio = Double.parseDouble(st.nextToken());
                int origen = Integer.parseInt(st.nextToken());
                int tecnologia = Integer.parseInt(st.nextToken());
                agrega(serie, marca, tamaño, precio, origen, tecnologia);
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
                TVH t = getTVH(i);
                pw.println(t.getSerie() + "/" + t.getMarca() + "/" + t.getTamaño() + "/" + t.getPrecio() + "/" + t.getOrigen() + "/" + t.getTecnologia());
            }
            pw.close();
        } catch (Exception ex) {
        }
    }
}
