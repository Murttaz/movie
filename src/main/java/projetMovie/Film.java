package projetMovie;

public class Film {

	private String id;
	private String nom;
	private String urlFilm;
	private int anneeSortie;
	private String plot;
	
	
	public Film(String id, String nom, String urlFilm, int anneeSortie, String plot) {
		super();
		this.id = id;
		this.nom = nom;
		this.urlFilm = urlFilm;
		this.anneeSortie = anneeSortie;
		this.plot = plot;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getUrlFilm() {
		return urlFilm;
	}


	public void setUrlFilm(String urlFilm) {
		this.urlFilm = urlFilm;
	}


	public int getAnneeSortie() {
		return anneeSortie;
	}


	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}


	public String getPlot() {
		return plot;
	}


	public void setPlot(String plot) {
		this.plot = plot;
	}
	
	
	
	
}
