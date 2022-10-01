package fr.hn.services.model.bridge;

import java.math.BigDecimal;

import fr.hn.services.model.Devise;

public interface InterfaceCompteBancaire {

	BigDecimal getMontantSolde();

	void setMontantSolde(BigDecimal nouveauMontantSolde);

	Devise getDeviseOrigine();

}
