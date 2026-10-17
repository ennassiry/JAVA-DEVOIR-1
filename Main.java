package com.ennassiry.controle;

public class Main {

	public static void main(String[] args) {

		Client c1 = new Client("EN-NASSIRY", "Mohammed");
		Client c2 = new Client("EN-NASSIRY", "Morad");
		Vehicule voiture1 = new Voiture("A", "Yamaha", 300, 5);

		Vehicule voiture2 = new Voiture("B", "Tesla", 400, 7);

		Vehicule moto1 = new Moto("AA", "Docker", 150, 125);

		Vehicule[] vehicules = new Vehicule[3];

		vehicules[0] = voiture1;
		vehicules[1] = voiture2;
		vehicules[2] = moto1;

		for (Vehicule v : vehicules) {
			v.afficherDetails();
		}

		Location location1 = new Location(3, c1, voiture1);

		Location location2 = new Location(2, c2, voiture2);

		Location location3 = new Location(6, c1, moto1);

		Location[] locations = new Location[3];

		locations[0] = location1;
		locations[1] = location2;
		locations[2] = location3;

		System.out.println("---------------------------------------------");
		double somme = 0;
		for (Location l : locations) {
			l.afficherRecapitulatif();
			somme += l.calculerMontant();
		}

		System.out.println("---------------------------------------------");

		System.out.println("le montant total de toutes les locations : " + somme);

	}
}
