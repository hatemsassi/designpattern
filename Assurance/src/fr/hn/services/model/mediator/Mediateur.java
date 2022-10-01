package fr.hn.services.model.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediateur {
	protected Map<String, OMC> mutuelles = new HashMap<>();

	public void addOMC(final String ref, final OMC omc) {
		mutuelles.put(ref, omc);
	}

	public abstract void transmettreInformation(Information infos);
}
