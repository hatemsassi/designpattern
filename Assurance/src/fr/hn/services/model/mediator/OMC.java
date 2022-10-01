package fr.hn.services.model.mediator;

public abstract class OMC {

	private String codeOMC;

	protected String libelle;

	private String codeRacine;

	private String mailOMC;

	protected Mediateur mediateur;

	public OMC(final String codeOMC, final String libelle, final String codeRacine, final String mailOMC) {
		super();
		this.codeOMC = codeOMC;
		this.libelle = libelle;
		this.codeRacine = codeRacine;
		this.mailOMC = mailOMC;
	}

	public OMC(final String libelle, final Mediateur mediateur) {
		super();
		this.libelle = libelle;
		this.mediateur = mediateur;
		mediateur.addOMC(libelle, this);
	}

	public abstract void envoyer(Information info);

	public abstract void recevoir(Information info);

	public String getCodeOMC() {
		return codeOMC;
	}

	public void setCodeOMC(final String codeOMC) {
		this.codeOMC = codeOMC;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	public String getCodeRacine() {
		return codeRacine;
	}

	public void setCodeRacine(final String codeRacine) {
		this.codeRacine = codeRacine;
	}

	public String getMailOMC() {
		return mailOMC;
	}

	public void setMailOMC(final String mailOMC) {
		this.mailOMC = mailOMC;
	}

}
