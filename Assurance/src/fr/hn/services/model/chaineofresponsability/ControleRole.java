package fr.hn.services.model.chaineofresponsability;

/**
 * @author U05E750
 */
public class ControleRole extends ControleAuthentification {

	/**
	 * @param email
	 * @param password
	 * @return
	 */
	@Override
	public boolean verification(final String email, final String password) {
		if (email.equals("admin@example.com")) {
			System.out.println("Hello, admin!");
			return true;
		}
		System.out.println("Hello, user!");
		return verificationSuivante(email, password);
	}

}
