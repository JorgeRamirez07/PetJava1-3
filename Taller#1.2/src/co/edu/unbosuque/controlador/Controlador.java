package co.edu.unbosuque.controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import co.edu.unbosque.vista.Vista;
import co.edu.unbosuque.modelo.Filecsv;
import co.edu.unbosuque.modelo.ManagerDAO;

public class Controlador {
	Vista v;
	ManagerDAO mdao;

	public Controlador() {
		v = new Vista();
		mdao = new ManagerDAO();
		int opcion = v.preguntarMenu();
		System.out.println(opcion);
		switch (opcion) {
		case 1:
			System.out.println("Ingresaste la opcion 1");
			new Filecsv();
			break;
		case 2:
			System.out.println("Ingresaste la opcion 2");
			long p = Long.parseLong(v.leerString("Por favor danos el numero del microship"));
			mdao.buscarporMicroship(p);
			
			break;// Este metodo colo el numero y no sirve, solo me sirve poniendo enteros
		case 3:
			v.mostrarMensaje("eligio la tercera opcion");
			v.leerString("Por favor dinos la Especie del animal");
			break;
		case 4:
			v.mostrarMensaje("eligio la cuarta opcion");
			String m = v.leerString("Ingresa el numero,(TOP|LAST),es potencialmente peligroso?");
			m.replace("“", "").replace("”", "");
			String s[] = m.split(",");
			mdao.findByPotentDangerousInNeighborhood(Integer.parseInt(s[0]), s[1], s[2]);
			v.mostrarMensaje("Has ingresado lo siguiente /n" + s[0] + "\n" + s[1] + "\n" + s[2] );
			break;
		case 5:
			
			v.mostrarMensaje("eligio Buscar por id del animal");
			v.mostrarMensaje("Ingresaste la opcion 5");
			m = v.leerString("Ingresa el sexo, la especie, el tamaño, y potencialmente peligroso?");
			m.replace("“", "").replace("”", "");
			String x[] = m.split(",");

			mdao.findByMultipleFields(x[0], x[2], x[2], x[3]);
			v.mostrarMensaje("Has ingresado lo siguiente /n" + x[0] + "\n" + x[1] + "\n" + x[2] + "\n" + x[3]);
			break;
		}
	}
}
