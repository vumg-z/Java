package com.poo.app;
import com.poo.model.Perro;
import com.poo.model.Cat;

public class App {
	
	
	 public static void main(String[] args) {
		 
		 
		 //variables
		 
			 //Para perro
				 int edadPerro = 12;
				 int idPerro = 66;
			 
			//Para gato
			 
				 int edadGato = 3; 
				 int idGato = 66;
				 String nombreGato = "tornillo";
		 
		 //creamos objetos
		 
		 	//perro
			 Perro pluto;
			 pluto = new Perro(idPerro,edadPerro);
			 
			//gato
			 
			 Cat tornillo;
			 tornillo = new Cat(edadGato, idGato, nombreGato);
		 
		 //output perro
			 pluto.ladrar();
			 
		 //salto de linea
			 System.out.println("");
			 
	     //output gato
			 System.out.println("La edad del gato tornillo es "+tornillo.getEdad());
			 
			 tornillo.setEdad(5);
			 
			 System.out.println("Pero cambio en el codigo a: "+tornillo.getEdad());
	 }
	 
}
