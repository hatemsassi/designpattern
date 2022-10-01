package fr.hn.services.model.mediator;

public class OMCImpl extends OMC {

	public OMCImpl(final String libelle, final Mediateur mediateur) {
		super(libelle, mediateur);
	}

	@Override
	public void envoyer(final Information infos) {
		System.out.println("----------Début d'envoie--------------------");
		System.out.println("OMC :" + libelle);
		System.out.println("Envoie information vers " + infos.getDestinataire());
		infos.setExpediteur(libelle);
		System.out.println("----------Fin d'envoie----------------------");
		mediateur.transmettreInformation(infos);

	}

	@Override
	public void recevoir(final Information infos) {
		System.out.println("----------Début de réception--------------------");
		System.out.println("OMC :" + libelle);
		System.out.println("Reception du message");
		System.out.println("Contenu : " + infos.getContenu());
		System.out.println("Expéditeur : " + infos.getExpediteur());
		System.out.println("----------Fin de réception----------------------");
	}

}
