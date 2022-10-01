package fr.hn.services.model.decorator;

import fr.hn.services.model.CarteBancaire;

public class LectureCarteBancaire implements DataCarteBancaire {
	private CarteBancaire carteBancaire = new CarteBancaire();

	@Override
	public void writeData(final String data) {
		carteBancaire.setClesecurite(data);
	}

	@Override
	public String readData() {

		return carteBancaire.data();
	}

	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(final CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

}
