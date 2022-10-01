package fr.hn.services.model;

public class ProfessionnelSante {

	private String nom;

	private String prenom;

	private String iban;

	private String siret;

	private String raisonSocial;

	private String adresseComplete;

	private String numTel;

	public ProfessionnelSante() {
		super();
	}

	public ProfessionnelSante(final String nom, final String prenom, final String iban, final String siret, final String raisonSocial,
			final String adresseComplete, final String numTel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.iban = iban;
		this.siret = siret;
		this.raisonSocial = raisonSocial;
		this.adresseComplete = adresseComplete;
		this.numTel = numTel;
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

	public String getIban() {
		return iban;
	}

	public void setIban(final String iBAN) {
		iban = iban;
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

	@Override
	public String toString() {
		return "ProfessionnelSante [nom=" + nom + ", prenom=" + prenom + ", iban=" + iban + ", siret=" + siret + ", raisonSocial=" + raisonSocial
				+ ", adresseComplete=" + adresseComplete + ", numTel=" + numTel + "]";
	}

}
