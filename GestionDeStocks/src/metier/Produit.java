package metier;

import java.util.Date;



public class Produit {
	private int reference;
	private String nom;
	private int quantite;
	private Date date;
	private float prix;
	
	
	public Produit() {}
	
	
	public int getReference() {
		return reference;
	}
	
	
	public void setReference(int reference) {
		this.reference = reference;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String name) {
		this.nom = name;
	}
	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	public void retirer(double q) {
		this.quantite-=q;
	}
	
	public void deposer(double q) {
		this.quantite+=q;
	}

	
	
	

}
