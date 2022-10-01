package fr.hn.services.model;

import java.math.BigDecimal;

/**
 * 
 * @author U05E750
 *
 */
public interface BuilderCB {
	
	public void setNumeroCompte(String numeroCompte);
	//Particulier
	public void setNom(String nom);
	public void setPrenom(String prenom);
	public void setAge(int age);
	
	//PRO
	public void setSiret(String siret);
	public void setRaisonSocial(String raisonSocial);
	
	public void setAdresseComplete(String adresseComplete);
	public void setNumTel(String numTel);
	public void setMontantSolde(BigDecimal montantSolde);
	
	public void setCarteBancaire(CarteBancaire carteBancaire);
	
}
