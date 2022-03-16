package prueba;

import java.io.File;
import java.util.Scanner;
public class Ex1Ls {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean option = true;
		while(option) {	// rwx orden de los permisos
			try {
				System.out.println("Enter Path direction: ");
				String pathName = "C:\\Users\\marck\\"+input.nextLine();
				File directory= new File(pathName);
				for(String file:directory.list()) {
					File currentFile = new File(pathName);
					if(directory.list(file).isDirectory())	System.out.print("d-");
					else	System.out.print("-");
					if(directory.canRead()) System.out.print("r-");
					else	System.out.print("-");
					if(directory.canWrite())	System.out.print("w-");
					else	System.out.println("-");
					if(directory.canExecute())	System.out.print("x  ");
					else	System.out.print("- ");
					System.out.println(file);
				}
				System.out.println("Continue s\\n?");
				if(input.nextLine().equals("n"))
					option = false;

			}			
			catch (NullPointerException e) {
				System.out.println("Incorrect path try again");
			}
		}
		System.out.println("Bye");
		input.close();
	}
}
