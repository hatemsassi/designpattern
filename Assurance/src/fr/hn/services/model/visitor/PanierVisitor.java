package fr.hn.services.model.visitor;

public interface PanierVisitor {

	int visit(Livre livre);

	int visit(Fruit fruit);
}
