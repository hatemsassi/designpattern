package fr.hn.services.model.mediator;

public class MediateurImpl extends Mediateur {

	@Override
	public void transmettreInformation(final Information infos) {
		OMC dest = mutuelles.get(infos.getDestinataire());
		dest.recevoir(infos);
	}
}
