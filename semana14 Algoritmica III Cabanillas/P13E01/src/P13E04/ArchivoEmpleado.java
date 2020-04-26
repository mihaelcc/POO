/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P13E04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class ArchivoEmpleado extends ArregloEmpleado{
	protected String nombre;
	public ArchivoEmpleado(String nombre){
	super();	
            this.nombre=nombre;
                
		lee();
	}
	public void graba(){
	try{
		FileWriter fw = new FileWriter(nombre);
		PrintWriter pw = new PrintWriter(fw);

		for(int i=0; i<getN(); i++){
			Empleado f=getEmpleado(i);
			if(f instanceof EmpleadoPermanente){
				pw.println("1/"+
					   ((EmpleadoPermanente)(f)).getSueldo());
                        pw.println(""+
					   ((EmpleadoPermanente)(f)).getAfiliacion());
                        }else{
				pw.println("2/"+
					   ((EmpleadoVendedor)(f)).getMontovendido() );
                                pw.println(""+
					   ((EmpleadoVendedor)(f)).getTasacomision() );
				
		}}
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
				double sueldo=Double.parseDouble(st.nextToken());
                                int afiliacion=Integer.parseInt(st.nextToken());
				Empleado a=new EmpleadoPermanente(sueldo,afiliacion);
				agrega(a);
			}else{// cuadrado
				double monto=Double.parseDouble(st.nextToken());
                                double tasa=Double.parseDouble(st.nextToken());
				Empleado b=new EmpleadoVendedor(monto,tasa);
				agrega(b);
			}	
			linea=br.readLine();	
		}
		br.close();
	}catch(Exception ex){}
	}
}

