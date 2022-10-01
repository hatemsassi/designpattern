package fr.hn.services.model.mediator;

import java.io.IOException;

/**
 * @author U05E750
 */
public class ClientTest {
	static MediateurImpl meditaur = new MediateurImpl();

	public static void main(final String[] args) throws IOException {

		OMC omc1 = new OMCImpl("MGEN", meditaur);
		OMC omc2 = new OMCImpl("MH", meditaur);

		omc1.envoyer(new Information("data", omc1.getLibelle(), omc2.getLibelle()));
	}
}
