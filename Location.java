package com.ennassiry.controle;

public class Location {
	private int nbJours;
	private Client client;
	private Vehicule vehicule;

	public Location(int nbJours, Client client, Vehicule vehicule) {
		this.nbJours = nbJours;
		this.client = client;
		this.vehicule = vehicule;
	}

	public double calculerMontant() {
		double res = vehicule.calculerCout(nbJours);
		return res;
	}

	public void afficherRecapitulatif() {
		System.out.println("je suis " + this.client.getNom() + " " + this.client.getPrenom());
		System.out.println("   la marque :" + vehicule.marque + " duree " + this.nbJours
				+ " montant total de la location " + this.calculerMontant());

	}

}
