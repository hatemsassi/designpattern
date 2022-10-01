package fr.hn.services.model.memento;

import java.util.Stack;

import fr.hn.services.model.Facture;

public class CareTaker {

	private Stack<FactureMemento> factureHistory = new Stack<>();

	public void save(final Facture fact) {
		factureHistory.push(fact.save());
	}

	public void revert(final Facture fact) {
		fact.revert(factureHistory.pop());
	}

	public void affiche() {
		while (!factureHistory.isEmpty()) {
			System.out.println("Numero de facture : " + factureHistory.pop().getNumeroFacture() + " Montant de la facture : "
					+ factureHistory.pop().getMontantFacture());
		}
	}
}
