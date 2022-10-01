package fr.hn.services.model.command;

import fr.hn.services.model.FeuilleDeSoin;

public class CommandTeletransmissionMutuelle implements Command {
	private MutuelleRecepteur mutuelleRecepteur;

	private FeuilleDeSoin feuilleDeSoin;

	public CommandTeletransmissionMutuelle(final MutuelleRecepteur mutuelleRecepteur) {
		super();
		this.mutuelleRecepteur = mutuelleRecepteur;
	}

	@Override
	public void executer() {
		mutuelleRecepteur.actionRembMutuelle(feuilleDeSoin);

	}

	public MutuelleRecepteur getMutuelleRecepteurr() {
		return mutuelleRecepteur;
	}

	public void setMutuelleRecepteur(final MutuelleRecepteur mutuelleRecepteur) {
		this.mutuelleRecepteur = mutuelleRecepteur;
	}

	public FeuilleDeSoin getFeuilleDeSoin() {
		return feuilleDeSoin;
	}

	@Override
	public void setFeuilleDeSoin(final FeuilleDeSoin feuilleDeSoin) {
		this.feuilleDeSoin = feuilleDeSoin;
	}

}
