package org.eclipse.model;

import java.util.List;

public class Personne {

	private int id;
	private String nom;
	private Adresse adresse;
	private List<String> sports;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
	public List<String> getSports() {
		return sports;
	}

	public void setSports(List<String> sports) {
		this.sports = sports;
	}

	public void	afficher() {
		//System.out.println("Personne [" + id + "] nom=" + nom  );
		System.out.println("Personne [" + id + "] nom=" + nom + " adresse: " + adresse );
		System.out.println("\tsports: ");
		sports.forEach(System.out::println);
	}
}
