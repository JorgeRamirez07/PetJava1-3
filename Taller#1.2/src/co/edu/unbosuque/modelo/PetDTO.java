package co.edu.unbosuque.modelo;

import java.io.Serializable;

public class PetDTO implements Serializable{
	String id;
	long microschip;
	String species;
	String sex;
	String size;
	boolean potentDangerous;
	String neigborhood;
	public PetDTO(String id, long microschip, String species, String sex, String size, boolean potentDangerous,
			String neigborhood) {
		super();
		this.id = id;
		this.microschip = microschip;
		this.species = species;
		this.sex = sex;
		this.size = size;
		this.potentDangerous = potentDangerous;
		this.neigborhood = neigborhood;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getMicroschip() {
		return microschip;
	}
	public void setMicroschip(long microschip) {
		this.microschip = microschip;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isPotentDangerous() {
		return potentDangerous;
	}
	public void setPotentDangerous(boolean potentDangerous) {
		this.potentDangerous = potentDangerous;
	}
	public String getNeigborhood() {
		return neigborhood;
	}
	public void setNeigborhood(String neigborhood) {
		this.neigborhood = neigborhood;
	}
	

	}

