package projetMovie;

import java.util.Date;

public class Acteur extends Personne{
	

	private String id;
	private Date dateNaissance;
	private int height;
	
	public Acteur(String nomPers, String urlPers, String id,Date dateNaissance,int height) {
		super(nomPers, urlPers);
// TODO Auto-generated constructor stub
		this.id=id;
		this.dateNaissance=dateNaissance;
		this.height=height;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
