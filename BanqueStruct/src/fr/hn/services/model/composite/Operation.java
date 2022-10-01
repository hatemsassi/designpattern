package fr.hn.services.model.composite;

import java.math.BigDecimal;

public class Operation {

	private BigDecimal montantOperation;

	private TypeOperation typeOperation;

	public Operation(final BigDecimal montantOperation, final TypeOperation typeOperation) {
		super();
		this.montantOperation = montantOperation;
		this.typeOperation = typeOperation;
	}

	public BigDecimal getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(final BigDecimal montantOperation) {
		this.montantOperation = montantOperation;
	}

	public TypeOperation getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(final TypeOperation typeOperation) {
		this.typeOperation = typeOperation;
	}

}
