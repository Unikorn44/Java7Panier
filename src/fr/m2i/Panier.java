package fr.m2i;

import java.util.ArrayList;


public class Panier {
	
	ArrayList<Article> course;
	
	
	//méthode création nouveau panier
	public Panier(){
		this.course = new ArrayList<Article>();
	}
	
	public ArrayList<Article> getCourse() {
		return course;
	}
	
	public void setCourse(ArrayList<Article> course) {
		this.course = course;
	}
	
	
	@SuppressWarnings("unused")
	private int prixTotal() {
		int totalCourses = 0;
		for (int i = 0; i < course.size(); i++) {	
			totalCourses += this.course.get(i).getPrix();
		}
		return totalCourses;
	}
	
	@SuppressWarnings("unused")
	private int nbreArticles() {		
		return course.size();
	}
	
	public void ajouterArticle(Article article) {
		course.add(article);
	}
	
	//comparaison paniers
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Panier)) return false;
		
		Panier panierTest = (Panier)obj;
		
		return this.course.equals(panierTest.getCourse());

	}


	//clone paniers
	@SuppressWarnings("unchecked")
	public void clone(Object obj) {
		if(obj instanceof Panier) {
			Panier panierClone = (Panier)obj;
			panierClone.setCourse((ArrayList<Article>) this.course.clone());
		}
	}


	
}
