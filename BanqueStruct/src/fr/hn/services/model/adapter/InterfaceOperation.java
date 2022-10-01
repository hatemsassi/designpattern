package fr.hn.services.model.adapter;

import java.math.BigDecimal;

import fr.hn.services.model.CompteBancaire;

public interface InterfaceOperation {

	BigDecimal calculSolde(CompteBancaire compteBancaire, BigDecimal montantOperation, TypeOperation typeOperation);

}
