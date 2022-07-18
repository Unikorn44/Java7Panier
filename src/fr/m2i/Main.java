package fr.m2i;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//création panier1
		Panier panier1 = new Panier();
		
		Article article1 = new Article(1, 5, "ananas");
		Article article2 = new Article(2, 9, "pomme");
		Article article3 = new Article(3, 15, "mangue");
		Article article4 = new Article(4, 17, "peche");
	
		panier1.ajouterArticle(article1);
		panier1.ajouterArticle(article2);
		panier1.ajouterArticle(article3);
		
		//création panier2
		Panier panier2 = new Panier();
	
		panier2.ajouterArticle(article1);
		panier2.ajouterArticle(article2);
		panier2.ajouterArticle(article3);
		//panier2.ajouterArticle(article4);
	
		//comparaison panier1 et panier2
		System.out.println("panier1 est égal à panier2 ? " + panier1.equals(panier2));
	
		
		
		//création panier3
		Panier panier3 = new Panier();
		panier1.clone(panier3);
		
		//comparaison panier3 et panier2
		System.out.println("panier3 est le clone de panier2 ? " + panier2.equals(panier3));
		
		//comparaison panier3 et panier1
		System.out.println("panier3 est le clone de panier1 ? " + panier1.equals(panier3));
		
	}
	
	
}
