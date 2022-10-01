package fr.hn.services.model;

import java.math.BigDecimal;

import fr.hn.services.model.memento.FactureMemento;

public class Facture {

	private String numeroFacture;

	private String dateFacture;

	private String email;

	private BigDecimal montantFacture;

	public Facture(final String numeroFacture, final String dateSoin, final BigDecimal montantFacture) {
		super();
		this.numeroFacture = numeroFacture;
		dateFacture = dateSoin;
		this.montantFacture = montantFacture;
	}

	public FactureMemento save() {
		return new FactureMemento(numeroFacture, montantFacture);
	}

	public void revert(final FactureMemento fact) {
		numeroFacture = fact.getNumeroFacture();
		montantFacture = fact.getMontantFacture();
	}

	public String getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(final String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public String getDateSoin() {
		return dateFacture;
	}

	public void setDateSoin(final String dateSoin) {
		dateFacture = dateSoin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public BigDecimal getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(final BigDecimal montantFacture) {
		this.montantFacture = montantFacture;
	}

	@Override
	public String toString() {
		return "Facture [numeroFacture=" + numeroFacture + ", dateFacture=" + dateFacture + ", email=" + email + ", montantFacture=" + montantFacture
				+ "]";
	}

}
