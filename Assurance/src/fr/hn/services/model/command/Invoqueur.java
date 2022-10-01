package fr.hn.services.model.command;

import java.util.HashMap;
import java.util.Map;

import fr.hn.services.model.FeuilleDeSoin;
import fr.hn.services.model.Observer.RemboursementObserver;

public class Invoqueur implements RemboursementObserver {

	private Map<String, Command> commandes = new HashMap<>();

	public void addCommand(final String ref, final Command cmd) {
		commandes.put(ref, cmd);
	}

	public void invoquer(final String ref, final FeuilleDeSoin feuilleDeSoin) {
		Command cmd = commandes.get(ref);
		if (cmd != null) {
			cmd.setFeuilleDeSoin(feuilleDeSoin);
			cmd.executer();
			update(feuilleDeSoin);

		}
	}

	@Override
	public void update(final FeuilleDeSoin feuilleDeSoin) {
		System.out.println("Notification de rembourssement :");
		System.out.println("Envoie de mail à l'adresse de bénéficiaire :" + feuilleDeSoin.getBeneficiaire().getEmail());

	}
}
