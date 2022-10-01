package fr.hn.services.model.templatemethod;

import fr.hn.services.model.FeuilleDeSoin;

public class RembEmployeur extends RembourssementArretTemplate {

	public RembEmployeur(final FeuilleDeSoin feuilleDeSoin) {
		super(feuilleDeSoin);
	}

	@Override
	public void calculpartEmployeur(final FeuilleDeSoin feuilleDeSoin) {
		System.out.println("Montant Rembourssement de l'employeur :" + feuilleDeSoin.getArretMaladie().getNombreJours() * 70);
	}

	@Override
	public void calculpartSecu(final FeuilleDeSoin feuilleDeSoin) {
		// RAS
	}

}
