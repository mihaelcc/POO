package p12e01;

import java.util.ArrayList;

public class ArregloTVH {

    protected ArrayList<TVH> a;

    public ArregloTVH() {
        a = new ArrayList<TVH>();

    }

    public void agrega(TVH t) {
        a.add(t);
    }

    public void agrega(String serie, int marca, int tamaño, double precio,
            int origen, int tecnologia) {
        a.add(new TVH(serie, marca, tamaño, precio, origen, tecnologia));
    }

    public TVH getTVH(int i) {
        return a.get(i);
    }

    public TVH getTVH() {
        return a.get(0);
    }

    public int getN() {
        return a.size();
    }

    public TVH busca(String serie) {
        for (int i = 0; i < getN(); i++) {
            if (getTVH(i).getSerie().equals(serie)) {
                return getTVH(i);
            }
        }
        return null;
    }

    void elimina(int i) {
        a.remove(i);
    }

    void elimina(String serie) {
        if (busca(serie) != null) {
            a.remove(busca(serie));
        }

    }

    void elimina(TVH t) {
        a.remove(t);
    }

    public double mayorPrecio() {
        double m = a.get(0).getPrecio();
        for (int i = 1; i < getN(); i++) {
            if (getTVH(i).getPrecio() > m) {
                m = getTVH(i).getPrecio();
            }

        }
        return m;
    }

    public double menorPrecio() {
        double m = a.get(0).getPrecio();
        for (int i = 1; i < getN(); i++) {
            if (getTVH(i).getPrecio() < m) {
                m = getTVH(i).getPrecio();
            }
        }
        return m;
    }

    public double precioPromedio() {
        double s = 0;
        for (int i = 1; i < getN(); i++) {
            s += getTVH(i).getPrecio();
        }
        return s / getN();
    }
}
