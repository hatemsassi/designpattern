package fr.hn.services.model;

import java.math.BigDecimal;

public class DemandeOuvertureCompteBancaire {
	
	private String numeroCompte;
	private String nom;
	private String prenom;
	private int age;
	private String siret;
	private String raisonSocial;
	private String adresseComplete;
	private String numTel;
	private BigDecimal montantSolde = BigDecimal.ZERO;
	private TypeCompte typeCompte;
	
	private DemandeCarte demandeCarte;
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public String getAdresseComplete() {
		return adresseComplete;
	}
	public void setAdresseComplete(String adresseComplete) {
		this.adresseComplete = adresseComplete;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public BigDecimal getMontantSolde() {
		return montantSolde;
	}
	public void setMontantSolde(BigDecimal montantSolde) {
		this.montantSolde = montantSolde;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	public DemandeCarte getDemandeCarte() {
		return demandeCarte;
	}
	public void setDemandeCarte(DemandeCarte demandeCarte) {
		this.demandeCarte = demandeCarte;
	}
	
	
	
}
