/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Pablito
 */
public class ArchivoBarcoMercante extends ArregloBarcoMercante{
    
    // atributos protegidos
    protected String nombre;
    // constructor
    public ArchivoBarcoMercante(String nombre){
	super();
	this.nombre=nombre;
	lee();
    }
    // métodos que operan un archivo de texto
    public void lee(){
	try{
		FileReader fr = new FileReader(nombre);
		BufferedReader br = new BufferedReader(fr);
		String linea=br.readLine();
		while(linea != null){
			StringTokenizer st = new StringTokenizer(linea,"/");
			String nombre=st.nextToken();
			String flotabilidad=st.nextToken();
			double velocidad=Double.parseDouble(st.nextToken());
			int carga=Integer.parseInt(st.nextToken());
                        String mercancia=st.nextToken();
                        String foto=st.nextToken();			
			agrega(nombre,flotabilidad,velocidad,carga,mercancia,
                                foto);
			linea= br.readLine();
                }
                br.close();
    }catch(Exception ex){ }
}
public void graba(){
	try{
		FileWriter fw = new FileWriter(nombre);
		PrintWriter pw= new PrintWriter(fw);
		for(int i=0; i<getN(); i++){
			BarcoMercante b =getBarcoMercante(i);
			pw.println(b.getNombre()+"/"+
				     b.getFlotabilidad()+"/"+
				     b.getVelocidad()+"/"+
				     b.getCarga_util()+"/"+
				     b.getMercania()+"/"+
				     b.getFoto());
		}
		pw.close();
}catch(Exception ex){}
}    
}
