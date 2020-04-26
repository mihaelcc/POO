/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class Archivofiguras extends ArregloFiguras{
	protected String nombre;
	public Archivofiguras(String nombre){
	super();	
            this.nombre=nombre;
                
		lee();
	}
	public void graba(){
	try{
		FileWriter fw = new FileWriter(nombre);
		PrintWriter pw = new PrintWriter(fw);

		for(int i=0; i<getN(); i++){
			Figura f=getFigura(i);
			if(f instanceof Circulo)
				pw.println("1/"+
					   ((Circulo)(f)).getRadio() );
			else
				pw.println("2/"+
					   ((Cuadrado)(f)).getLado() );
				
		}
		pw.close();
	}catch(Exception ex){	}

	}
      

	public void lee(){
	try{
		FileReader fr = new FileReader(nombre);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		while(linea!=null){
			StringTokenizer st =new StringTokenizer(linea,"/");
			int tipo=Integer.parseInt(st.nextToken());
			if(tipo==1){ // circulo
				double radio=Double.parseDouble(st.nextToken());
				Figura a=new Circulo(radio);
				agrega(a);
			}else{// cuadrado
				double lado=Double.parseDouble(st.nextToken());
				Figura b=new Cuadrado(lado);
				agrega(b);
			}	
			linea=br.readLine();	
		}
		br.close();
	}catch(Exception ex){}
	}
}

