package fr.hn.services.model.chaineofresponsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author U05E750
 */
public class ClientTest {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private static Server server;

	private static void init() {
		server = new Server();
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");

		// Tous les controles sont liés
		ControleAuthentification controleAuthentification = ControleAuthentification.parcourirChaine(new ControleNombreAuthentification(1),
				new ControleUtilisateur(server), new ControleRole());

		// Le serveur obtient une chaîne à partir du code client.
		server.setControleAuthentification(controleAuthentification);
	}

	public static void main(final String[] args) throws IOException {
		init();

		boolean success;
		do {
			System.out.print("Enter email: ");
			String email = reader.readLine();
			System.out.print("Input password: ");
			String password = reader.readLine();

			success = server.logIn(email, password);

		} while (!success);
	}
}
