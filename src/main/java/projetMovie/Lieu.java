package projetMovie;

public class Lieu {
	
	private String nomVille;
	private String etatDep;
	
	
	public Lieu(String nomVille, String etatDep) {
		super();
		this.nomVille = nomVille;
		this.etatDep = etatDep;
	}


	public String getNomVille() {
		return nomVille;
	}


	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}


	public String getEtatDep() {
		return etatDep;
	}


	public void setEtatDep(String etatDep) {
		this.etatDep = etatDep;
	}
	
	

}
