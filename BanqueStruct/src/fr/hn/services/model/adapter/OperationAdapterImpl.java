package fr.hn.services.model.adapter;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;

public class OperationAdapterImpl implements OperationAdapter {

	private InterfaceOperation operation;

	private TypeConversion typeConversion;

	public OperationAdapterImpl(final InterfaceOperation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public BigDecimal calculSolde(final CompteBancaire compteBancaire, final BigDecimal montantOperation, final TypeOperation typeOperation) {
		return convert(operation.calculSolde(compteBancaire, montantOperation, typeOperation), typeConversion);

	}

	public BigDecimal convert(final BigDecimal montantSolde, final TypeConversion typeConversion) {

		return montantSolde.multiply(typeConversion.getTauxConversion());

	}

	public TypeConversion getTypeConversion() {
		return typeConversion;
	}

	@Override
	public void setTypeConversion(final TypeConversion typeConversion) {
		this.typeConversion = typeConversion;
	}
}
