package fr.hn.services;

import fr.hn.services.model.CompteBancaire;
import fr.hn.services.model.DemandeOuvertureCompteBancaire;

public interface InterfaceBanqueFacade {
	public CompteBancaire ouvertureCompteBancaire();

	public void setDemandeOuvertureCompteBancaire(DemandeOuvertureCompteBancaire demandeOuvertureCompteBancaire);
}
