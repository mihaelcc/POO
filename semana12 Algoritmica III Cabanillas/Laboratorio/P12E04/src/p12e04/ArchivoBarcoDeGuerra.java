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
public class ArchivoBarcoDeGuerra extends ArregloBarcoDeGuerra{
    
    // atributos protegidos
    protected String nombre;
    // constructor
    public ArchivoBarcoDeGuerra(String nombre){
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
                        String artilleria=st.nextToken();
                        String foto=st.nextToken();
                        double alcance=Double.parseDouble(st.nextToken());
			int tripulacion=Integer.parseInt(st.nextToken());                        
			agrega(nombre,flotabilidad,velocidad,artilleria,
                                foto,alcance,tripulacion);
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
			BarcoDeGuerra b =getBarcoDeGuerra(i);
			pw.println(b.getNombre()+"/"+
				     b.getFlotabilidad()+"/"+
				     b.getVelocidad()+"/"+
				     b.getArtillería()+"/"+
				     b.getFoto()+"/"+
                                     b.getAlcance()+"/"+
				     b.getTripulación());
		}
		pw.close();
}catch(Exception ex){}
}    
}
