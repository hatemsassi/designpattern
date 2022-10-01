package fr.hn.services.model.adapter;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;
import fr.hn.services.model.Devise;

/**
 * @author U05E750
 */
public class ClientAdapter {

	public static void main(final String[] args) {
		InterfaceOperation operation = new Operation();
		CompteBancaire compteBancaire = new CompteBancaire("NUMCOMPTE", "NOM", "PRENOM", new BigDecimal("5000.00"), Devise.EUR);
		BigDecimal nouveauMontantSolde = operation.calculSolde(compteBancaire, new BigDecimal("500.00"), TypeOperation.DEBIT);
		System.out.println("Montant Solde Compte : " + nouveauMontantSolde + " " + compteBancaire.getDeviseOrigine());

		// Mise à jour montant solde du compte
		compteBancaire.setMontantSolde(nouveauMontantSolde);

		OperationAdapter operationAdapter = new OperationAdapterImpl(operation);
		operationAdapter.setTypeConversion(new TypeConversion(new BigDecimal("0.97"), Devise.DOLLAR));
		System.out.println("Montant Solde Compte : " + operationAdapter.calculSolde(compteBancaire, new BigDecimal("4000.00"), TypeOperation.CREDIT)
				+ " " + Devise.DOLLAR);
	}
}
