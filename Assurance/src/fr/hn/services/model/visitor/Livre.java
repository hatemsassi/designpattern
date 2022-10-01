package fr.hn.services.model.visitor;

class Livre implements ItemElement {
	private int prix;

	private String isbnNumber;

	public Livre(final int cout, final String isbn) {
		prix = cout;
		isbnNumber = isbn;
	}

	public int getPrix() {
		return prix;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(final PanierVisitor visitor) {
		return visitor.visit(this);
	}

}
