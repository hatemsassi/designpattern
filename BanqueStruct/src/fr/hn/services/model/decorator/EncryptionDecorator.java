package fr.hn.services.model.decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataCarteBancaireDecorator {

	public EncryptionDecorator(final DataCarteBancaire source) {
		super(source);
	}

	@Override
	public void writeData(final String data) {
		super.writeData(encode(data));
	}

	@Override
	public String readData() {
		return decode(super.readData());
	}

	private String encode(final String data) {
		byte[] result = data.getBytes();
		for (int i = 0; i < result.length; i++) {
			result[i] += (byte) 1;
		}
		return Base64.getEncoder().encodeToString(result);
	}

	private String decode(final String data) {
		byte[] result = Base64.getDecoder().decode(data);
		for (int i = 0; i < result.length; i++) {
			result[i] -= (byte) 1;
		}
		return new String(result);
	}
}
