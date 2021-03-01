package co.edu.unbosuque.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Patch;
import javax.swing.JOptionPane;

public class ManagerDAO {
	private ArrayList<PetDTO> petarreglo;
	private ArrayList<PetDTO> pepeligrosa;

	public ManagerDAO() {

		petarreglo = new ArrayList<PetDTO>();
		pepeligrosa = new ArrayList<PetDTO>();

	}

	public void buscarporMicroship(long p) {
		try {
			
			int cont = 0;
			BufferedReader reader = new BufferedReader(new FileReader("pets-citizens.csv"));
			boolean found = false;
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(";");
				try {
					long totalParts = Long.parseLong(parts[0]);
					if (totalParts == p) {
						System.out.println("Encontrado satisfactoriamente ");
						found = true;
						System.out.println(parts[0] +"\n"+ parts[1]+"\n"+parts[2]+"\n"+parts[3]+"\n"+parts[4]+"\n"+parts[5]);
						break; 
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			if (found == false) {
				System.out.println("No encontrada");
			} else {
				System.out.println("Programa completado");
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public ArrayList<PetDTO> findByPotentDangerousInNeighborhood(int n, String pos, String neighborhood) {
		int contador = 0;
		if (pos.toUpperCase().equals("top".toUpperCase())) {
			for (int i = 0; i < petarreglo.size(); i++) {
				if (petarreglo.get(i).isPotentDangerous()
						&& petarreglo.get(i).getNeigborhood().equals(neighborhood.toUpperCase())) {
					pepeligrosa.add(petarreglo.get(i));
					contador++;
				}
				if (contador == n) {
					return pepeligrosa;
				}
			}
		}
		if (pos.toUpperCase().equals("last".toUpperCase())) {
			for (int i = petarreglo.size() - 1; i >= 0; i--) {
				if (petarreglo.get(i).isPotentDangerous()
						&& petarreglo.get(i).getNeigborhood().equals(neighborhood.toUpperCase())) {
					pepeligrosa.add(petarreglo.get(i));
					contador++;
				}
				if (contador == n) {
					return pepeligrosa;
				}
			}

		}
		return null;
	}

	public List findByMultipleFields(String sex, String species, String size, String potentDangerous) {

		List pd = new ArrayList<>();
		String pc = "";
		boolean dangerous = false;

		if (potentDangerous.equals("si".toUpperCase())) {
			dangerous = true;
		} else if (potentDangerous.equals("no".toUpperCase())) {
			dangerous = false;
		}

		for (int i = 0; i < petarreglo.size(); i++) {

			if (petarreglo.get(i).getSex().equals(sex.toUpperCase())
					&& petarreglo.get(i).getSpecies().equals(species.toUpperCase())
					&& petarreglo.get(i).getSize().equals(size.toUpperCase())
					&& petarreglo.get(i).isPotentDangerous() == dangerous) {

				pd.add(petarreglo.get(i).getId());
			}
		}
		return pd;
	}

}
