package org.eclipse.springtp05form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	@Length(min = 2, max= 30)
	@NotEmpty(message ="le champ nom est obligatoire")
	private String nom;
	@Length(min = 2, max= 30)
	@NotEmpty(message ="le champ prénom est obligatoire")
	private String prenom;
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
