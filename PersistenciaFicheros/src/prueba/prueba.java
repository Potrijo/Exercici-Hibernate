package prueba;

import java.io.File;

public class prueba {
	//private String direction = "C:\\Users\\marck\\Desktop";
	
	public static void main(String[] args) {
		
		//File directorio = new File("c:/"); //directorio a listar 
		System.out.println("Hello :)");
		//try:		
		if(args[0].equals("-a")) {
			System.out.println("No has entrado argumentos");
			
		}
		else {
			System.out.println("Nombre de parámetro incorrecto");
		}
		
		if(args.length == 0) {
			System.out.println("Has entrado un parametro");
		}
		
		else {
			System.out.println("Incorrect position");
		}
		//catch()
		
		
	}
	
}
