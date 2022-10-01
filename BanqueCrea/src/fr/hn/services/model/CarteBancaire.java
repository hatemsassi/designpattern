package fr.hn.services.model;

import java.io.Serializable;

public class CarteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numCarte;

	private String expiration;

	private Integer cvv;

	public CarteBancaire() {
		super();
	}

	public CarteBancaire(final String numCarte, final String expiration, final Integer cvv) {
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

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(final Integer cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CarteBancaire [numCarte=" + numCarte + ", expiration=" + expiration + ", cvv=" + cvv + "]";
	}

}
