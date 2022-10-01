package fr.hn.services.model;

import java.io.Serializable;

public class CarteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numCarte;

	private String expiration;

	private String cvv;

	private String clesecurite;

	public CarteBancaire() {
		super();
	}

	public CarteBancaire(final String numCarte, final String expiration, final String cvv) {
		super();
		this.numCarte = numCarte;
		this.expiration = expiration;
		this.cvv = cvv;
	}

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(final String numCarte) {
		this.numCarte = numCarte;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(final String expiration) {
		this.expiration = expiration;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(final String cvv) {
		this.cvv = cvv;
	}

	public String getClesecurite() {
		return clesecurite;
	}

	public void setClesecurite(final String clesecurite) {
		this.clesecurite = clesecurite;
	}

	@Override
	public String toString() {
		return "CarteBancaire [numCarte=" + numCarte + ", expiration=" + expiration + ", cvv=" + cvv + "]";
	}

	public String data() {
		return clesecurite;
	}

}
