package fr.hn.services.model.factory.master;

import fr.hn.services.model.CarteBancaire;

/**
 * Produit concret
 * @author U05E750
 */
public class MasterCardClassic extends CarteBancaire implements MasterCard {

	private String description;

	public MasterCardClassic(final String numCarte, final String expiration, final Integer cvv) {
		super(numCarte, expiration, cvv);
	}

	public MasterCardClassic() {
		super();
	}

	@Override
	public CarteBancaire fabricationCarteMaster() {

		setDescription("La carte Master internationale tout simplement. Payez et retirez de l'argent en France comme � l'�tranger.");
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
