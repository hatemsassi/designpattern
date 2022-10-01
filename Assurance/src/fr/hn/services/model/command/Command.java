package fr.hn.services.model.command;

import fr.hn.services.model.FeuilleDeSoin;

public interface Command {

	public void executer();

	public void setFeuilleDeSoin(FeuilleDeSoin feuilleDeSoin);

}
