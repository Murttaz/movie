package projetMovie;

public class Pays {

	private String nomPays;
	private String urlPays;
	
	
	public Pays(String nomPays, String urlPays) {
		super();
		this.nomPays = nomPays;
		this.urlPays = urlPays;
	}


	public String getNomPays() {
		return nomPays;
	}


	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}


	public String getUrlPays() {
		return urlPays;
	}


	public void setUrlPays(String urlPays) {
		this.urlPays = urlPays;
	}
	
	
	
}
