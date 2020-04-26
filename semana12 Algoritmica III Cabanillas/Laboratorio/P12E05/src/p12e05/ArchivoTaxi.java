/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12e05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Pablito
 */
public class ArchivoTaxi extends ArregloTaxi{
    
    // atributos protegidos
    protected String nombre;
    // constructor
    public ArchivoTaxi(String nombre){
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
			String matricula=st.nextToken();
                        String modelo=st.nextToken();			
			double potencia=Double.parseDouble(st.nextToken());
			int numero_licencia=Integer.parseInt(st.nextToken());
			String foto=st.nextToken();
			agrega(matricula,modelo,foto,potencia,numero_licencia);
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
			TAXI t =getTaxi(i);
			pw.println(t.getMatricula()+"/"+
				     t.getModelo()+"/"+
				     t.getPotencia()+"/"+
				     t.getNumero_licencia()+"/"+
				     t.getFoto());
		}
		pw.close();
}catch(Exception ex){}
}    
}
