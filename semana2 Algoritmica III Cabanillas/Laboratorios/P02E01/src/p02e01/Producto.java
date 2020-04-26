/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p02e01;

/**
 *
 * @author michael
 */
public class Producto {
    //atributos privados
    private String codigo,descripcion;
    private double precio;
    
    public Producto(String codigo, String descrpcion, double precio)
    {this.codigo=codigo;
    this.descripcion=descripcion;
    this.precio=precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
