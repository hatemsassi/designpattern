package fr.hn.services.model.composite;

import java.math.BigDecimal;

import fr.hn.services.model.Devise;

public class TypeConversion {

	private BigDecimal tauxConversion;

	private Devise deviseConversionCible;

	public TypeConversion(final BigDecimal tauxConversion, final Devise deviseConversionCible) {
		super();
		this.tauxConversion = tauxConversion;
		this.deviseConversionCible = deviseConversionCible;
	}

	public BigDecimal getTauxConversion() {
		return tauxConversion;
	}

	public void setTauxConversion(final BigDecimal tauxConversion) {
		this.tauxConversion = tauxConversion;
	}

	public Devise getDeviseConversionCible() {
		return deviseConversionCible;
	}

	public void setDeviseConversionCible(final Devise deviseConversionCible) {
		this.deviseConversionCible = deviseConversionCible;
	}

}
