package fr.hn.services.model;
/**
 * 
 * @author U05E750
 *
 */

import java.math.BigDecimal;


public class CompteBancaireBuilder implements BuilderCB {

	private String numeroCompte;
	private String nom;
	private String prenom;
	private String siret;
	private String raisonSocial;
	private String adresseComplete;
	private String numTel;
	private BigDecimal montantSolde;
	private int age;
	private CarteBancaire carteBancaire;
	
	@Override
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public void setSiret(String siret) {
		this.siret = siret;
	}

	@Override
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	@Override
	public void setAdresseComplete(String adresseComplete) {
		this.adresseComplete = adresseComplete;
	}

	
	@Override
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Override
	public void setMontantSolde(BigDecimal montantSolde) {
		this.montantSolde = montantSolde;
	}
	@Override
	public void setAge(int age) {
		this.age= age;
		
	}
	
	@Override
	public void setCarteBancaire(CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
		
	}
	
	public CompteBancaire getCBProfessionnel() {
		return new CompteBancaire(numeroCompte, siret, raisonSocial, adresseComplete, numTel, montantSolde, carteBancaire);
	}
	public CompteBancaire getCBParticulier() {
		return new CompteBancaire(numeroCompte, nom, prenom, age, adresseComplete, numTel, montantSolde, carteBancaire);
	}



}
