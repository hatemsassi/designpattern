package fr.hn.services.model.templatemethod;

import fr.hn.services.model.FeuilleDeSoin;

public class RembSecu extends RembourssementArretTemplate {

	public RembSecu(final FeuilleDeSoin feuilleDeSoin) {
		super(feuilleDeSoin);
	}

	@Override
	public void calculpartSecu(final FeuilleDeSoin feuilleDeSoin) {
		System.out.println("Montant Rembourssement de la cpam :" + feuilleDeSoin.getArretMaladie().getNombreJours() * 100);
	}

	@Override
	public void calculpartEmployeur(final FeuilleDeSoin feuilleDeSoin) {
		// RAS
	}
}
