package fr.hn.services.model.chaineofresponsability;

/**
 * @author U05E750
 */
public class ControleNombreAuthentification extends ControleAuthentification {

	private int requeteParMinute;

	private int requete;

	private long currentTime;

	public ControleNombreAuthentification(final int requeteParMinute) {
		this.requeteParMinute = requeteParMinute;
		currentTime = System.currentTimeMillis();
	}

	@Override
	public boolean verification(final String email, final String password) {
		if (System.currentTimeMillis() > currentTime + 60_000) {
			requete = 0;
			currentTime = System.currentTimeMillis();
		}

		requete++;

		if (requete > requeteParMinute) {
			System.out.println("Limite de demandes dépassée!");
			Thread.currentThread().stop();
		}
		return verificationSuivante(email, password);
	}
}
