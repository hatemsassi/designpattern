package fr.hn.services.model.visitor;

class Fruit implements ItemElement {
	private int prixParKg;

	private int poids;

	private String name;

	public Fruit(final int prixKg, final int wt, final String nm) {
		prixParKg = prixKg;
		poids = wt;
		name = nm;
	}

	public int getPrixParKg() {
		return prixParKg;
	}

	public int getPoids() {
		return poids;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(final PanierVisitor visitor) {
		return visitor.visit(this);
	}

}
