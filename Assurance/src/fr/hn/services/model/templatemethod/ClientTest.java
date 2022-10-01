package fr.hn.services.model.templatemethod;

import java.io.IOException;
import java.math.BigDecimal;

import fr.hn.services.model.ArretMaladie;
import fr.hn.services.model.Beneficiaire;
import fr.hn.services.model.Facture;
import fr.hn.services.model.FeuilleDeSoin;
import fr.hn.services.model.ProfessionnelSante;
import fr.hn.services.model.TypeDeSoin;

/**
 * @author U05E750
 */
public class ClientTest {

	private static FeuilleDeSoin init() {
		FeuilleDeSoin feuilleSoin = new FeuilleDeSoin("27/09/2022", "note de professionel de santé", TypeDeSoin.DENTAIRE,
				new Beneficiaire("585415847896/30", "nom", "prenom", "iban", "dateNaissance", "adresseComplete", "numTel", "email"),
				new ProfessionnelSante("nomPS", "prenomPS", "ibanPS", "siret", "raisonSocial", "adresseComplete", "numTel"),
				new Facture("numeroFacture", "dateSoin", new BigDecimal("260.00")), new ArretMaladie(Boolean.TRUE, 3));

		System.out.println("Affichage feuille de soin : " + feuilleSoin.toString());

		return feuilleSoin;
	}

	public static void main(final String[] args) throws IOException {
		FeuilleDeSoin feuilleDeSoin = init();

		RembourssementArretTemplate rembType = new RembEmployeur(feuilleDeSoin);

		// using template method
		rembType.calculRemb(feuilleDeSoin);
		System.out.println("************");

		rembType = new RembSecu(feuilleDeSoin);

		// using template method
		rembType.calculRemb(feuilleDeSoin);
	}
}
