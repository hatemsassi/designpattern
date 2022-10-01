package fr.hn.services.model;

public class ArretMaladie {

	private boolean conge;

	private int nombreJours;

	public ArretMaladie(final boolean conge, final int nombreJours) {
		super();
		this.conge = conge;
		this.nombreJours = nombreJours;
	}

	public boolean isConge() {
		return conge;
	}

	public void setConge(final boolean conge) {
		this.conge = conge;
	}

	public int getNombreJours() {
		return nombreJours;
	}

	public void setNombreJours(final int nombreJours) {
		this.nombreJours = nombreJours;
	}

}
