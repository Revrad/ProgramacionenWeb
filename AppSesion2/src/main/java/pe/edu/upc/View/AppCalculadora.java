package pe.edu.upc.View;

import java.util.Scanner;

import pe.edu.upc.Entity.Operacion;

public class AppCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion objo=new Operacion();
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println("Operación: ");
			objo.setOperacion(s.next().charAt(0));
			
			System.out.println("Numero 1: ");
			objo.setNumeroA(s.nextDouble());
			
			System.out.println("Numero 2: ");
			objo.setNumeroB(s.nextDouble());
			
			System.out.println("Resultado: "+objo.Calcular());
			System.out.println("Continuar (Si/No)");
			
			if (s.next().equals("No")) {
				System.out.println("Ok, Gracias");
				break;
			}
		}

	}

}
