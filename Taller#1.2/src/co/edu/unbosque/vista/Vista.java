package co.edu.unbosque.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import co.edu.unbosuque.modelo.Filecsv;
import co.edu.unbosuque.modelo.ManagerDAO;


public class Vista {
	Scanner sc;
	public Vista() {
		 sc = new Scanner(System.in);
		 
		
	}
	public int preguntarMenu() {
		int opcion;
		System.out.println("Selecciones una opcion: \n"
				+"1.-Archivo csv: \n"
				+"2.-Buscar animal por su microschip: \n"
				+"3.-Contar por especie: \n"
				+"4.-Animales, potencialmente peligrosos, ingrese la localidad;  \n"
				+"5.-Buscar por id del animal: \n");
		
		opcion=sc.nextInt();
		sc.nextLine();
		return opcion;
	}public void mostrarMensaje(String n) {
		System.out.println(n);
	}
	public int leerEntero(String n) {
		System.out.println(n);
		return sc.nextInt();
	}
	public String leerString(String n) {
		System.out.println(n);
		return sc.nextLine();
	}

}
