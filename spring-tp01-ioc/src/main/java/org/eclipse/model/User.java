package org.eclipse.model;

import java.util.List;

public class User {

	private int id;
	private String nom;
	private String prenom;
	private Order order;
	private List<String> paymentMethods;
	
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

	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<String> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	
	public void	afficher() {
		//System.out.println("Personne [" + id + "] nom=" + nom  );
		System.out.println("User [" + id + "] " + nom  + " " + prenom + " order: " + order );
		System.out.println("paymentMethods: ");
		paymentMethods.forEach(System.out::println);
	}
}
