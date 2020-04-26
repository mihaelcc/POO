package p12e02;

import java.util.ArrayList;

public class ArregloPersonasH {

    protected ArrayList<PersonaH> a;

    public ArregloPersonasH() {
        a = new ArrayList<PersonaH>();
    }

    public void agrega(PersonaH p) {
        a.add(p);
    }

    public void agrega(String dni, String nombres, String apellidos, int edad, double peso, String email, String foto) {
        a.add(new PersonaH(dni, nombres, apellidos, edad, peso, email, foto));
    }

    public PersonaH getPersonaH(int i) {
        return a.get(i);
    }

    public PersonaH getPersonaH() {
        return a.get(0);
    }

    public int getN() {
        return a.size();
    }

    public PersonaH busca(String dni) {
        for (int i = 0; i < getN(); i++) {
            if (getPersonaH(i).getDni().equals(dni)) {
                return getPersonaH(i);
            }
        }
        return null;
    }

    public void elimina(int i) {
        a.remove(i);
    }

    public void elimina(String dni) {
        if (busca(dni) != null) {
            a.remove(busca(dni));
        }
    }

    public void elimina(PersonaH p) {
        a.remove(p);
    }

    public double mayorPeso() {
        double m = getPersonaH(0).getPeso();
        for (int i = 1; i < getN(); i++) {
            if (getPersonaH(i).getPeso() > m) {
                m = getPersonaH(i).getPeso();
            }
        }
        return m;
    }

    public double menorPeso() {
        double m = getPersonaH(0).getPeso();
        for (int i = 1; i < getN(); i++) {
            if (getPersonaH(i).getPeso() < m) {
                m = getPersonaH(i).getPeso();
            }
        }
        return m;
    }

    public double pesoPromedio() {
        double s = 0;
        for (int i = 1; i < getN(); i++) {
            s += getPersonaH(i).getPeso();
        }
        return s / getN();
    }
}
