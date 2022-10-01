package fr.hn.services.model.chaineofresponsability;

/**
 *
 */
public class ControleUtilisateur extends ControleAuthentification {
	private Server server;

	public ControleUtilisateur(final Server server) {
		this.server = server;
	}

	@Override
	public boolean verification(final String email, final String password) {
		if (!server.hasEmail(email)) {
			System.out.println("Email n'est pas enregistré!");
			return false;
		}
		if (!server.isValidPassword(email, password)) {
			System.out.println("Mot de passe erroné!");
			return false;
		}
		return verificationSuivante(email, password);
	}

}
