package com.ennassiry.controle;

public abstract class Vehicule {
	protected String immatriculation;
	protected String marque;
	protected double tarifJournalier;

	// consructeur pour initialliser les attributs

	public Vehicule(String immatriculation, String marque, double tarifJournalier) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.tarifJournalier = tarifJournalier;
	}
	// getter pour tarifJournalier

	public double tarifJournalier() {
		return this.tarifJournalier;
	}
	// classse absrtraite

	public void afficherDetails() {
		System.out.println(" # immatriculation : " + immatriculation + " , marque : " + marque + " , tarif Journalier :"
				+ tarifJournalier);
	}

	public abstract double calculerCout(int nbJours);

}
