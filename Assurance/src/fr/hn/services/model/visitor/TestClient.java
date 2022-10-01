package fr.hn.services.model.visitor;

public class TestClient {

	public static void main(final String[] args) {
		ItemElement[] items = new ItemElement[] {new Livre(20, "1234"), new Livre(100, "5678"), new Fruit(10, 2, "Banane"), new Fruit(5, 5, "Pomme")};

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(final ItemElement[] items) {
		PanierVisitor visitor = new PanierVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
