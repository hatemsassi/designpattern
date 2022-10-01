package fr.hn.services.model.composite;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;
import fr.hn.services.model.Devise;

/**
 * @author U05E750
 */
public class ClientComposite {

	public static void main(final String[] args) {
		GestionOperations batchalloperations = new GestionOperations();

		batchalloperations.chargerOpertions(//
				new Operation(new BigDecimal("500.00"), TypeOperation.DEBIT), //
				new Operation(new BigDecimal("200.00"), TypeOperation.DEBIT), //
				new Operation(new BigDecimal("4000.00"), TypeOperation.CREDIT), //
				new Operation(new BigDecimal("1000.00"), TypeOperation.DEBIT));

		CompteBancaire compteBancaire = new CompteBancaire("NUMCOMPTE", "NOM", "PRENOM", new BigDecimal("5000.00"), Devise.EUR);

		BigDecimal nouveauMontantSolde = batchalloperations.executeOperations(compteBancaire);
		System.out.println("Montant Solde Compte : " + nouveauMontantSolde + " " + compteBancaire.getDeviseOrigine());

	}
}
