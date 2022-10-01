package fr.hn.services.model;

public class Beneficiaire {

	private String numeroSs;

	private String nom;

	private String prenom;

	private String iban;

	private String dateNaissance;

	private String adresseComplete;

	private String numTel;

	private String email;

	public Beneficiaire(final String numeroSs, final String nom, final String prenom, final String iban, final String dateNaissance,
			final String adresseComplete, final String numTel, final String email) {
		super();
		this.numeroSs = numeroSs;
		this.nom = nom;
		this.prenom = prenom;
		this.iban = iban;
		this.dateNaissance = dateNaissance;
		this.adresseComplete = adresseComplete;
		this.numTel = numTel;
		this.email = email;
	}

	public String getNumeroSs() {
		return numeroSs;
	}

	public void setNumeroSs(final String numeroSs) {
		this.numeroSs = numeroSs;
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

	public void setIban(final String iban) {
		this.iban = iban;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(final String dateNaissance) {
		this.dateNaissance = dateNaissance;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Beneficiaire [numeroSs=" + numeroSs + ", nom=" + nom + ", prenom=" + prenom + ", iban=" + iban + ", dateNaissance=" + dateNaissance
				+ ", adresseComplete=" + adresseComplete + ", numTel=" + numTel + ", email=" + email + "]";
	}

}
