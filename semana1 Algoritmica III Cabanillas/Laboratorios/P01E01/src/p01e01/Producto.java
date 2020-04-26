

package p01e01;


public class Producto {
//atributos privados
    private String codigo,descripcion;
    private double precio;

    //metodos get- set

    public String getCodigo(){//los metodos empiezan con minusculas
        //pero si son compuestas la 2da palabra empieza con mayuscula
        //todos los metodos van hacer publicos y todos los atributos son privados

        return codigo;
    }
       public String getDescripcion(){
           return descripcion;

          }
       public double  getPrecio(){

           return   precio;

          }
       public void setCodigo(String c){

           codigo=c;//el atributo codigo va a recibir el parametro c

          }

       public void setDescripcion(String d){

           descripcion=d;
           }
        public void setPrecio(double p){

            precio=p;
           }

}


