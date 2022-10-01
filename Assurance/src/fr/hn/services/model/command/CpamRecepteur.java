package fr.hn.services.model.command;

import java.math.BigDecimal;

import fr.hn.services.model.FeuilleDeSoin;

public class CpamRecepteur {

	/**
	 * @param feuilleDeSoin
	 */
	public void actionRembCPAM(final FeuilleDeSoin feuilleDeSoin) {
		virement(feuilleDeSoin);
	}

	/**
	 * @param feuilleDeSoin
	 */
	private void virement(final FeuilleDeSoin feuilleDeSoin) {
		System.out.println("Message de la CPAM :  Le versement du montant "
				+ feuilleDeSoin.getFacture().getMontantFacture().multiply(new BigDecimal(30)).divide(new BigDecimal(100))
				+ " sur le compte de bénéficiaire " + feuilleDeSoin.getBeneficiaire().getIban() + "a été exécuté avec succès !");

	}
}
