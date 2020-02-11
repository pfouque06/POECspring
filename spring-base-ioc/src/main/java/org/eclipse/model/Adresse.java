package org.eclipse.model;

public class Adresse {

	private String rue;
	private String codePostal;
	private String ville;

	
	public Adresse(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville;
	}

}
