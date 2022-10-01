package fr.hn.services.model.command;

import fr.hn.services.model.FeuilleDeSoin;

public class CommandRemboursementBenef implements Command {
	private CpamRecepteur cpamRecepteur;

	private FeuilleDeSoin feuilleDeSoin;

	public CommandRemboursementBenef(final CpamRecepteur cpamRecepteur) {
		super();
		this.cpamRecepteur = cpamRecepteur;
	}

	@Override
	public void executer() {
		cpamRecepteur.actionRembCPAM(feuilleDeSoin);

	}

	public CpamRecepteur getCpamRecepteur() {
		return cpamRecepteur;
	}

	public void setCpamRecepteur(final CpamRecepteur cpamRecepteur) {
		this.cpamRecepteur = cpamRecepteur;
	}

	public FeuilleDeSoin getFeuilleDeSoin() {
		return feuilleDeSoin;
	}

	@Override
	public void setFeuilleDeSoin(final FeuilleDeSoin feuilleDeSoin) {
		this.feuilleDeSoin = feuilleDeSoin;
	}

}
