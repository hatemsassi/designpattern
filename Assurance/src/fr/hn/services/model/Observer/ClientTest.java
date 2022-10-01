package fr.hn.services.model.Observer;

import java.io.IOException;
import java.math.BigDecimal;

import fr.hn.services.model.Beneficiaire;
import fr.hn.services.model.Facture;
import fr.hn.services.model.FeuilleDeSoin;
import fr.hn.services.model.ProfessionnelSante;
import fr.hn.services.model.TypeDeSoin;
import fr.hn.services.model.command.Command;
import fr.hn.services.model.command.CommandRemboursementBenef;
import fr.hn.services.model.command.CommandTeletransmissionMutuelle;
import fr.hn.services.model.command.CpamRecepteur;
import fr.hn.services.model.command.Invoqueur;
import fr.hn.services.model.command.MutuelleRecepteur;

/**
 * @author U05E750
 */
public class ClientTest {
	static Invoqueur inv = new Invoqueur();

	private static FeuilleDeSoin init() {
		FeuilleDeSoin feuilleSoin = new FeuilleDeSoin("27/09/2022", "note de professionel de santé", TypeDeSoin.DENTAIRE,
				new Beneficiaire("585415847896/30", "nom", "prenom", "iban", "dateNaissance", "adresseComplete", "numTel", "email"),
				new ProfessionnelSante("nomPS", "prenomPS", "ibanPS", "siret", "raisonSocial", "adresseComplete", "numTel"),
				new Facture("numeroFacture", "dateSoin", new BigDecimal("260.00")));

		System.out.println("Affichage feuille de soin : " + feuilleSoin.toString());

		return feuilleSoin;
	}

	public static void main(final String[] args) throws IOException {

		FeuilleDeSoin feuilleDeSoin = init();

		CpamRecepteur cpamRecepteur = new CpamRecepteur();
		MutuelleRecepteur mutuelleRecepteur = new MutuelleRecepteur();

		Command cmdRem = new CommandRemboursementBenef(cpamRecepteur);
		Command cmdTransMut = new CommandTeletransmissionMutuelle(mutuelleRecepteur);

		inv.addCommand("REMBCPAM", cmdRem);
		inv.addCommand("TRANSREMBMUTUELLE", cmdTransMut);

		inv.invoquer("REMBCPAM", feuilleDeSoin);
		inv.invoquer("TRANSREMBMUTUELLE", feuilleDeSoin);

	}
}
