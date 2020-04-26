/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p09e03;

/**
 *
 * @author michael
 */
public class ProductoH extends Producto {
    
    private int stock, condicion;
    private String foto;
    
    
    public ProductoH (String codigo, String descripcion, double precio, int stock, int condicion, String foto)
   {super(codigo,descripcion, precio) ;
    this.stock=stock;
    this.condicion=condicion;
    this.foto=foto;
}

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the condicion
     */
    public int getCondicion() {
        return condicion;
    }

    /**
     * @param condicion the condicion to set
     */
    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
    
    
}
