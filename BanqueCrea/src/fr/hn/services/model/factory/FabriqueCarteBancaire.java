package fr.hn.services.model.factory;

import fr.hn.services.model.DemandeCarte;
import fr.hn.services.model.factory.master.MasterCard;
import fr.hn.services.model.factory.visa.VisaCard;

/**
 * Fabrique abstraite
 * 
 * @author U05E750
 *
 */
public interface FabriqueCarteBancaire {
	
	public VisaCard creationCarteVisa(DemandeCarte demandeCarte);

	public MasterCard creationCarteMaster(DemandeCarte demandeCarte);
	
}