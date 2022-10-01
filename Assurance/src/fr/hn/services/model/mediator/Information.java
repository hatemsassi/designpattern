package fr.hn.services.model.mediator;

public class Information {

	private String contenu;

	private String expediteur;

	private String destinataire;

	public Information(final String contenu, final String expediteur, final String destinataire) {
		super();
		this.contenu = contenu;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(final String contenu) {
		this.contenu = contenu;
	}

	public String getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(final String expediteur) {
		this.expediteur = expediteur;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(final String destinataire) {
		this.destinataire = destinataire;
	}

	@Override
	public String toString() {
		return "Information [contenu=" + contenu + ", expediteur=" + expediteur + ", destinataire=" + destinataire + "]";
	}

}
