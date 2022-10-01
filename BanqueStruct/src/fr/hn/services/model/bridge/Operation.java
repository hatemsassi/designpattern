package fr.hn.services.model.bridge;

import java.math.BigDecimal;

public class Operation implements InterfaceOperation {

	private InterfaceCompteBancaire compteBancaire;

	public Operation(final InterfaceCompteBancaire compteBancaire) {
		super();
		this.compteBancaire = compteBancaire;
	}

	@Override
	public BigDecimal calculSolde(final BigDecimal montantOperation, final TypeOperation typeOperation) {
		if (TypeOperation.DEBIT.equals(typeOperation)) {
			return compteBancaire.getMontantSolde().add(montantOperation.negate());
		} else {
			return compteBancaire.getMontantSolde().add(montantOperation);
		}

	}

}
