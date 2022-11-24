package projetMovie;


/**
 * @author v.fournier
 *
 */
public abstract class Personne {
	
	private String nomPers;
	private String urlPers;
	
	
	public Personne(String nomPers, String urlPers) {
		super();
		this.nomPers = nomPers;
		this.urlPers = urlPers;
	}
	public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	public String getUrlPers() {
		return urlPers;
	}
	public void setUrlPers(String urlPers) {
		this.urlPers = urlPers;
	}
	

}
