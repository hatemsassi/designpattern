package fr.hn.services.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CompteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroCompte;

	private String nom;

	private String prenom;

	private int age;

	private String siret;

	private String raisonSocial;

	private String adresseComplete;

	private String numTel;

	private BigDecimal montantSolde;

	private CarteBancaire carteBancaire;

	public CompteBancaire(final String numeroCompte, final String siret, final String raisonSocial, final String adresseComplete, final String numTel,
			final BigDecimal montantSolde, final CarteBancaire carteBancaire) {
		super();
		this.numeroCompte = numeroCompte;

		this.siret = siret;
		this.raisonSocial = raisonSocial;
		this.adresseComplete = adresseComplete;
		this.numTel = numTel;
		this.montantSolde = montantSolde;
		this.carteBancaire = carteBancaire;
	}

	public CompteBancaire(final String numeroCompte, final String nom, final String prenom, final int age, final String adresseComplete,
			final String numTel, final BigDecimal montantSolde, final CarteBancaire carteBancaire) {
		super();
		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresseComplete = adresseComplete;
		this.numTel = numTel;
		this.montantSolde = montantSolde;
		this.carteBancaire = carteBancaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(final String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(final String siret) {
		this.siret = siret;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(final String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public String getAdresseComplete() {
		return adresseComplete;
	}

	public void setAdresseComplete(final String adresseComplete) {
		this.adresseComplete = adresseComplete;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(final String numTel) {
		this.numTel = numTel;
	}

	public BigDecimal getMontantSolde() {
		return montantSolde;
	}

	public void setMontantSolde(final BigDecimal montantSolde) {
		this.montantSolde = montantSolde;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(final CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", siret=" + siret
				+ ", raisonSocial=" + raisonSocial + ", adresseComplete=" + adresseComplete + ", numTel=" + numTel + ", montantSolde=" + montantSolde
				+ ", carteBancaire=" + carteBancaire.toString() + "]";
	}

}
