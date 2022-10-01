package fr.hn.services.model.chaineofresponsability;

/**
 * Base ControleAuthentification class.
 * @author U05E750
 */
public abstract class ControleAuthentification {
	private ControleAuthentification next;

	public static ControleAuthentification parcourirChaine(final ControleAuthentification premierControle,
			final ControleAuthentification... chaineControle) {
		ControleAuthentification entete = premierControle;
		for (ControleAuthentification controlesuivant : chaineControle) {
			entete.next = controlesuivant;
			entete = controlesuivant;
		}
		return premierControle;
	}

	public abstract boolean verification(String email, String password);

	protected boolean verificationSuivante(final String email, final String password) {
		if (next == null) {
			return true;
		}
		return next.verification(email, password);
	}
}
