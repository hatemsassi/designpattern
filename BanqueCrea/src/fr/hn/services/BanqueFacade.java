package fr.hn.services;

import fr.hn.services.model.CompteBancaire;
import fr.hn.services.model.CompteBancaireBuilder;
import fr.hn.services.model.DemandeOuvertureCompteBancaire;
import fr.hn.services.model.Director;
import fr.hn.services.model.TypeCompte;

/**
 * @author U05E750
 */
public class BanqueFacade implements InterfaceBanqueFacade {

	private DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire;

	/**
	 * @param demandeOuvertureCompteBancaire
	 * @return CompteBancaire
	 */
	@Override
	public CompteBancaire ouvertureCompteBancaire() {
		Director director = new Director();

		CompteBancaireBuilder builder;
		if (TypeCompte.PARTICULIER.equals(demandeOuvertureCompteBancaire.getTypeCompte())) {
			builder = (CompteBancaireBuilder) director.constructCBParticulier(demandeOuvertureCompteBancaire);
			return builder.getCBParticulier();
		} else {
			builder = (CompteBancaireBuilder) director.constructCBProfessionnel(demandeOuvertureCompteBancaire);
			return builder.getCBProfessionnel();
		}
	}

	public DemandeOuvertureCompteBancaire getDemandeOuvertureCompteBancaire() {
		return demandeOuvertureCompteBancaire;
	}

	public void setDemandeOuvertureCompteBancaire(final DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire) {
		this.demandeOuvertureCompteBancaire = demandeOuvertureCompteBancaire;
	}

}
