package fr.hn.services.model.bridge;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;
import fr.hn.services.model.Devise;

/**
 * @author U05E750
 */
public class ClientBridge {

	public static void main(final String[] args) {

		InterfaceCompteBancaire compteBancaire = new CompteBancaire("NUMCOMPTE", "NOM", "PRENOM", new BigDecimal("5000.00"), Devise.EUR);
		InterfaceOperation operation = new Operation(compteBancaire);
		BigDecimal nouveauMontantSolde = operation.calculSolde(new BigDecimal("500.00"), TypeOperation.DEBIT);
		System.out.println("Montant Solde Compte : " + nouveauMontantSolde + " " + compteBancaire.getDeviseOrigine());
		// Mise à jour montant solde du compte
		compteBancaire.setMontantSolde(nouveauMontantSolde);

	}
}
