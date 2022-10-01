package fr.hn.services.model.templatemethod;

import fr.hn.services.model.FeuilleDeSoin;

public abstract class RembourssementArretTemplate {

	public RembourssementArretTemplate(final FeuilleDeSoin feuilleDeSoin) {

	}

	public void calculRemb(final FeuilleDeSoin feuilleDeSoin) {
		calculpartEmployeur(feuilleDeSoin);
		calculpartSecu(feuilleDeSoin);
	}

	public abstract void calculpartEmployeur(FeuilleDeSoin feuilleDeSoin);

	public abstract void calculpartSecu(FeuilleDeSoin feuilleDeSoin);
}
