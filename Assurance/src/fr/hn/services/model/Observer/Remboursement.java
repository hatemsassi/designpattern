package fr.hn.services.model.Observer;

import java.util.HashSet;
import java.util.Set;

import fr.hn.services.model.FeuilleDeSoin;

public class Remboursement implements RemboursementSubject {

	private Set<RemboursementObserver> setOfRemboursementObservers;

	private FeuilleDeSoin feuilleDeSoin;

	public Remboursement() {
		setOfRemboursementObservers = new HashSet<>();

	}

	@Override
	public void addObserver(final RemboursementObserver remboursementObserver) {
		setOfRemboursementObservers.add(remboursementObserver);
	}

	@Override
	public void removeObserver(final RemboursementObserver remboursementObserver) {
		setOfRemboursementObservers.remove(remboursementObserver);
	}

	@Override
	public void sendNotification() {
		for (RemboursementObserver observer : setOfRemboursementObservers) {
			observer.update(feuilleDeSoin);
		}
	}

	public Set<RemboursementObserver> getSetOfRemboursementObservers() {
		return setOfRemboursementObservers;
	}
}
