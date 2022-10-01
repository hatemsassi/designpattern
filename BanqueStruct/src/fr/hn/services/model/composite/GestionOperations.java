package fr.hn.services.model.composite;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;

public class GestionOperations {

	private CompositeOperation allOperations = new CompositeOperation();

	public void chargerOpertions(final Operation... operations) {
		allOperations.clear();
		allOperations.add(operations);
	}

	public BigDecimal executeOperations(final CompteBancaire compteBancaire) {
		for (Operation op : allOperations.getChildren()) {
			if (TypeOperation.DEBIT.equals(op.getTypeOperation())) {
				compteBancaire.setMontantSolde(compteBancaire.getMontantSolde().add(op.getMontantOperation().negate()));
			} else {
				compteBancaire.setMontantSolde(compteBancaire.getMontantSolde().add(op.getMontantOperation()));
			}
		}

		return compteBancaire.getMontantSolde();
	}
}
