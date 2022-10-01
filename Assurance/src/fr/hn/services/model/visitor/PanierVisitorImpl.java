package fr.hn.services.model.visitor;

class PanierVisitorImpl implements PanierVisitor {

	@Override
	public int visit(final Livre livre) {
		int cost = 0;

		if (livre.getPrix() > 50) {
			cost = livre.getPrix() - 5;
		} else {
			cost = livre.getPrix();
		}

		System.out.println("Livre ISBN::" + livre.getIsbnNumber() + " prix =" + cost);
		return cost;
	}

	@Override
	public int visit(final Fruit fruit) {
		int cost = fruit.getPrixParKg() * fruit.getPoids();
		System.out.println(fruit.getName() + " prix = " + cost);
		return cost;
	}

}
