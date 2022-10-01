package fr.hn.services.model;

public class FeuilleDeSoin {

	private String dateSoin;

	private String notePs;

	private TypeDeSoin typeDeSoin;

	private Beneficiaire beneficiaire;

	private ProfessionnelSante professionnelSante;

	private Facture facture;

	private ArretMaladie arretMaladie;

	public FeuilleDeSoin(final String dateSoin, final String notePs, final TypeDeSoin typeDeSoin, final Beneficiaire beneficiaire,
			final ProfessionnelSante professionnelSante, final Facture facture) {
		super();
		this.dateSoin = dateSoin;
		this.notePs = notePs;
		this.typeDeSoin = typeDeSoin;
		this.beneficiaire = beneficiaire;
		this.professionnelSante = professionnelSante;
		this.facture = facture;
	}

	public FeuilleDeSoin(final String dateSoin, final String notePs, final TypeDeSoin typeDeSoin, final Beneficiaire beneficiaire,
			final ProfessionnelSante professionnelSante, final Facture facture, final ArretMaladie arretMaladie) {
		super();
		this.dateSoin = dateSoin;
		this.notePs = notePs;
		this.typeDeSoin = typeDeSoin;
		this.beneficiaire = beneficiaire;
		this.professionnelSante = professionnelSante;
		this.facture = facture;
		this.arretMaladie = arretMaladie;
	}

	public String getDateSoin() {
		return dateSoin;
	}

	public void setDateSoin(final String dateSoin) {
		this.dateSoin = dateSoin;
	}

	public String getNotePs() {
		return notePs;
	}

	public void setNotePs(final String notePs) {
		this.notePs = notePs;
	}

	public TypeDeSoin getTypeDeSoin() {
		return typeDeSoin;
	}

	public void setTypeDeSoin(final TypeDeSoin typeDeSoin) {
		this.typeDeSoin = typeDeSoin;
	}

	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(final Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public ProfessionnelSante getProfessionnelSante() {
		return professionnelSante;
	}

	public void setProfessionnelSante(final ProfessionnelSante professionnelSante) {
		this.professionnelSante = professionnelSante;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(final Facture facture) {
		this.facture = facture;
	}

	public ArretMaladie getArretMaladie() {
		return arretMaladie;
	}

	public void setArretMaladie(final ArretMaladie arretMaladie) {
		this.arretMaladie = arretMaladie;
	}

	@Override
	public String toString() {
		return "FeuilleDeSoin [dateSoin=" + dateSoin + ", notePs=" + notePs + ", typeDeSoin=" + typeDeSoin + ", beneficiaire=" + beneficiaire
				+ ", professionnelSante=" + professionnelSante + ", facture=" + facture + "]";
	}

}
