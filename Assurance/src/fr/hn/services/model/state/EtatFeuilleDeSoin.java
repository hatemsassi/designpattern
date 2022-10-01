package fr.hn.services.model.state;

import fr.hn.services.model.FeuilleDeSoin;

public class EtatFeuilleDeSoin implements State {

	@Override
	public void doAction(final FeuilleDeSoin feuilleDeSoin) {
		if (feuilleDeSoin.getArretMaladie().isConge()) {
			System.out.println("Envoie arrêt maladie à l'employeur.");
			System.out.println("Nombre de jours de arrêt maladie : " + feuilleDeSoin.getArretMaladie().getNombreJours());
		}
	}

}
