package fr.hn.services.model.decorator;

/**
 * @author U05E750
 */
public class ClientDecorator {

	public static void main(final String[] args) {
		LectureCarteBancaire lectureCB = new LectureCarteBancaire();
		lectureCB.writeData("45872541253604/2024254");

		System.out.println("- Input ----------------");
		System.out.println(lectureCB.readData());

		DataCarteBancaireDecorator encoded = new EncryptionDecorator(lectureCB);
		encoded.writeData(lectureCB.readData());

		System.out.println("- Encoded ----------------");
		System.out.println(lectureCB.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}
}
