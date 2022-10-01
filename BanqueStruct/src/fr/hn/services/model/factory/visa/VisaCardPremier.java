package fr.hn.services.model.factory.visa;

import fr.hn.services.model.CarteBancaire;

/**
 * Produit concret
 * @author U05E750
 */
public class VisaCardPremier extends CarteBancaire implements VisaCard {

	private String description;

	public VisaCardPremier(final String numCarte, final String expiration, final String cvv) {
		super(numCarte, expiration, cvv);
	}

	public VisaCardPremier() {
		super();
	}

	@Override
	public CarteBancaire fabricationCarteVisa() {

		setDescription("La Carte Visa Premier vous offre une protection � toute �preuve pour votre vie quotidienne et vos d�placements.");
		setNumCarte("85741563254858");
		setExpiration("12/2024");
		setCvv("983");
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public String toString() {

		return "VisaCardPremier [description=" + description + "] Infos CarteBancaire [numCarte=" + getNumCarte() + ", expiration=" + getExpiration()
				+ ", cvv=" + getCvv() + "]";
	}

}
