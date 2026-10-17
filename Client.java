package com.ennassiry.controle;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private static int comp;

	public Client(String nom, String prenom) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return "je suis " + this.nom + " " + this.prenom;
	}

}
