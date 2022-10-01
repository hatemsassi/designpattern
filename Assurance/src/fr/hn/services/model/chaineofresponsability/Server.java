package fr.hn.services.model.chaineofresponsability;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {

	private Map<String, String> users = new HashMap<>();

	private ControleAuthentification controleAuthentification;

	/**
	 * Le client passe une chaîne d'objets au serveur. Cela améliore la flexibilité et facilite le test de la classe de serveur.
	 */
	public void setControleAuthentification(final ControleAuthentification controleAuthentification) {
		this.controleAuthentification = controleAuthentification;
	}

	/**
	 * Le serveur reçoit l'e-mail et le mot de passe du client et envoie la demande d'autorisation à la chaîne.
	 */
	public boolean logIn(final String email, final String password) {
		if (controleAuthentification.verification(email, password)) {
			System.out.println("L'autorisation a réussi !");
			return true;
		}
		return false;
	}

	public void register(final String email, final String password) {
		users.put(email, password);
	}

	public boolean hasEmail(final String email) {
		return users.containsKey(email);
	}

	public boolean isValidPassword(final String email, final String password) {
		return users.get(email).equals(password);
	}
}
