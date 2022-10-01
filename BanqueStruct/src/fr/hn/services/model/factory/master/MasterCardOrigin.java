package fr.hn.services.model.factory.master;

import fr.hn.services.model.CarteBancaire;

/**
 * Produit concret
 * @author U05E750
 */
public class MasterCardOrigin extends CarteBancaire implements MasterCard {

	private String description;

	public MasterCardOrigin(final String numCarte, final String expiration, final String cvv) {
		super(numCarte, expiration, cvv);
	}

	public MasterCardOrigin() {
		super();
	}

	@Override
	public CarteBancaire fabricationCarteMaster() {

		setDescription("La carte Origin est une carte de retrait et de paiement � contr�le syst�matique de solde.");
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
