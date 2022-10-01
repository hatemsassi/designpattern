package fr.hn.services.model.state;

import fr.hn.services.model.FeuilleDeSoin;

public class ArretMaladieContext implements State {

	private State etat;

	@Override
	public void doAction(final FeuilleDeSoin feuilleDeSoin) {
		etat.doAction(feuilleDeSoin);
	}

	public State getEtat() {
		return etat;
	}

	public void setEtat(final State etat) {
		this.etat = etat;
	}

}
