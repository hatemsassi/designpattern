package fr.hn.services.model.factory.visa;

import fr.hn.services.model.CarteBancaire;

/**
 * Produit concret
 * @author U05E750
 */
public class VisaCardInfinite extends CarteBancaire implements VisaCard {

	private String description;

	public VisaCardInfinite(final String numCarte, final String expiration, final Integer cvv) {
		super(numCarte, expiration, cvv);
	}

	public VisaCardInfinite() {
		super();
	}

	@Override
	public CarteBancaire fabricationCarteVisa() {

		setDescription(
				"La Carte Visa Infinite est la carte de prestige de la gamme BNP Paribas. Pour un v�ritable service sur-mesure et haut de gamme.");
		setNumCarte("85741563254858");
		setExpiration("12/2024");
		setCvv(983);
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
