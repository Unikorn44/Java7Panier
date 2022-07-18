package fr.m2i;

public class Article {
	
	private int _id;
	private int _prix;
	private String _description;
	
	
	Article (int id, int prix, String description){
		this.setId(id);
		this.setPrix(prix);
		this.setDescription(description);		
	}


	public int getId() {
		return _id;
	}


	private void setId(int id) {
		this._id = id;
	}


	public int getPrix() {
		return _prix;
	}


	private void setPrix(int prix) {
		this._prix = prix;
	}


	public String getDescription() {
		return _description;
	}


	private void setDescription(String description) {
		this._description = description;
	}
	
	
}