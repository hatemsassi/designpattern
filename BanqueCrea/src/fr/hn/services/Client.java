package fr.hn.services;

import fr.hn.services.model.DemandeCarte;
import fr.hn.services.model.DemandeOuvertureCompteBancaire;
import fr.hn.services.model.NatureCarte;
import fr.hn.services.model.TypeCarte;
import fr.hn.services.model.TypeCompte;

/**
 * @author U05E750
 */
public class Client {

	static InterfaceBanqueFacade banqueFacade = new BanqueFacade();

	public static void main(final String[] args) {

		DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire = new DemandeOuvertureCompteBancaire();
		demandeOuvertureCompteBancaire.setNumeroCompte("NUMCOMPTE");
		demandeOuvertureCompteBancaire.setTypeCompte(TypeCompte.PARTICULIER);
		demandeOuvertureCompteBancaire.setNom("XXXX");
		demandeOuvertureCompteBancaire.setPrenom("XXXX");
		demandeOuvertureCompteBancaire.setAdresseComplete("yyyyyyyy");

		DemandeCarte demandeCarte = new DemandeCarte();
		demandeCarte.setNatureCarte(NatureCarte.VISA_PREMIER);
		demandeCarte.setTypeCarte(TypeCarte.VISA);

		demandeOuvertureCompteBancaire.setDemandeCarte(demandeCarte);

		banqueFacade.setDemandeOuvertureCompteBancaire(demandeOuvertureCompteBancaire);
		System.out.println("\nCompte Bancaire Particulier :\n" + banqueFacade.ouvertureCompteBancaire().toString());
	}
}
