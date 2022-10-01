package fr.hn.services.model;

import fr.hn.services.model.factory.FabriqueCarteBancaire;
import fr.hn.services.model.factory.FabriqueParticulier;
import fr.hn.services.model.factory.FabriqueProfessionnel;
import fr.hn.services.model.factory.master.MasterCard;
import fr.hn.services.model.factory.visa.VisaCard;

public class Director {

	private BuilderCB builder = new CompteBancaireBuilder();

	FabriqueCarteBancaire fabriqueCarteBancaire;

	/**
	 * @param builder
	 * @param demandeOuvertureCompteBancaire
	 */
	public BuilderCB constructCBProfessionnel(final DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire) {
		fabriqueCarteBancaire = new FabriqueProfessionnel();
		builder.setNumeroCompte(demandeOuvertureCompteBancaire.getNumeroCompte());
		builder.setSiret(demandeOuvertureCompteBancaire.getSiret());
		builder.setRaisonSocial(demandeOuvertureCompteBancaire.getRaisonSocial());
		builder.setMontantSolde(demandeOuvertureCompteBancaire.getMontantSolde());

		if (demandeOuvertureCompteBancaire.getDemandeCarte().getTypeCarte().equals(TypeCarte.VISA)) {
			VisaCard visacard = fabriqueCarteBancaire.creationCarteVisa(demandeOuvertureCompteBancaire.getDemandeCarte());

			builder.setCarteBancaire(visacard.fabricationCarteVisa());
		} else {
			MasterCard mastercard = fabriqueCarteBancaire.creationCarteMaster(demandeOuvertureCompteBancaire.getDemandeCarte());
			builder.setCarteBancaire(mastercard.fabricationCarteMaster());
		}
		return builder;
	}

	/**
	 * @param builder
	 * @param demandeOuvertureCompteBancaire
	 */
	public BuilderCB constructCBParticulier(final DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire) {
		fabriqueCarteBancaire = new FabriqueParticulier();
		builder.setNumeroCompte(demandeOuvertureCompteBancaire.getNumeroCompte());
		builder.setNom(demandeOuvertureCompteBancaire.getNom());
		builder.setPrenom(demandeOuvertureCompteBancaire.getPrenom());
		builder.setMontantSolde(demandeOuvertureCompteBancaire.getMontantSolde());

		if (demandeOuvertureCompteBancaire.getDemandeCarte().getTypeCarte().equals(TypeCarte.VISA)) {
			VisaCard visacard = fabriqueCarteBancaire.creationCarteVisa(demandeOuvertureCompteBancaire.getDemandeCarte());

			builder.setCarteBancaire(visacard.fabricationCarteVisa());
		} else {
			MasterCard mastercard = fabriqueCarteBancaire.creationCarteMaster(demandeOuvertureCompteBancaire.getDemandeCarte());
			builder.setCarteBancaire(mastercard.fabricationCarteMaster());
		}
		return builder;
	}
}
