package fr.hn.services.model.factory;

import fr.hn.services.model.DemandeCarte;
import fr.hn.services.model.NatureCarte;
import fr.hn.services.model.factory.master.MasterCard;
import fr.hn.services.model.factory.master.MasterCardClassic;
import fr.hn.services.model.factory.master.MasterCardOrigin;
import fr.hn.services.model.factory.visa.VisaCard;
import fr.hn.services.model.factory.visa.VisaCardInfinite;
import fr.hn.services.model.factory.visa.VisaCardPremier;

/**
 * Fabrique concrète
 * 
 * @author U05E750
 *
 */
public class FabriqueParticulier implements FabriqueCarteBancaire {

	@Override
	public VisaCard creationCarteVisa(DemandeCarte demandeCarte) {
		if(NatureCarte.VISA_INFINITE.equals(demandeCarte.getNatureCarte()))
			return new VisaCardInfinite();
		else
			return new VisaCardPremier();
	}

	@Override
	public MasterCard creationCarteMaster(DemandeCarte demandeCarte) {
		if(NatureCarte.MASTER_CLASSIC.equals(demandeCarte.getNatureCarte()))
			return new MasterCardClassic();
		else
			return new MasterCardOrigin();
	}


}