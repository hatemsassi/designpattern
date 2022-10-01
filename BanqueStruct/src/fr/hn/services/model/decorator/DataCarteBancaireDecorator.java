package fr.hn.services.model.decorator;

/**
 * @author U05E750
 */
public class DataCarteBancaireDecorator implements DataCarteBancaire {

	private DataCarteBancaire wrappee;

	public DataCarteBancaireDecorator(final DataCarteBancaire wrappee) {
		super();
		this.wrappee = wrappee;
	}

	@Override
	public void writeData(final String data) {
		wrappee.writeData(data);

	}

	@Override
	public String readData() {
		return wrappee.readData();
	}

}
