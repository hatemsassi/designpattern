package fr.hn.services.model.memento;

import java.math.BigDecimal;

public class FactureMemento {

	private String numeroFacture;

	private BigDecimal montantFacture;

	public FactureMemento(final String numeroFacture, final BigDecimal montantFacture) {
		super();
		this.numeroFacture = numeroFacture;
		this.montantFacture = montantFacture;
	}

	public String getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(final String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public BigDecimal getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(final BigDecimal montantFacture) {
		this.montantFacture = montantFacture;
	}

}
