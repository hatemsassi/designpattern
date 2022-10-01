package fr.hn.services.model.memento;

import java.io.IOException;
import java.math.BigDecimal;

import fr.hn.services.model.Facture;

/**
 * @author U05E750
 */
public class ClientTest {
	static CareTaker careTaker = new CareTaker();

	public static void main(final String[] args) throws IOException {

		Facture fact = new Facture("F5847", "08/08/2022", new BigDecimal("260.00"));

		System.out.println("Facture avant sauvegarde : " + fact.toString());

		careTaker.save(fact);

		fact.setMontantFacture(new BigDecimal("160.00"));
		careTaker.save(fact);
		System.out.println("Affichage de la facture après changement du montant : " + fact.toString());

		fact.setMontantFacture(new BigDecimal("120.00"));
		careTaker.save(fact);
		careTaker.revert(fact);

		System.out.println("Retrour arrière : " + fact.toString());

		careTaker.revert(fact);
		System.out.println("Retrour arrière : " + fact.toString());
		careTaker.revert(fact);
		System.out.println("Retrour à l'état initial : " + fact.toString());

	}
}
