package fr.hn.services.model.adapter;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;

public class Operation implements InterfaceOperation {

	@Override
	public BigDecimal calculSolde(final CompteBancaire compteBancaire, final BigDecimal montantOperation, final TypeOperation typeOperation) {
		if (TypeOperation.DEBIT.equals(typeOperation)) {
			return compteBancaire.getMontantSolde().add(montantOperation.negate());
		} else {
			return compteBancaire.getMontantSolde().add(montantOperation);
		}

	}

}
