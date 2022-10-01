package fr.hn.services.model.state;

import fr.hn.services.model.FeuilleDeSoin;

public interface State {

	public void doAction(FeuilleDeSoin feuilleDeSoin);
}
