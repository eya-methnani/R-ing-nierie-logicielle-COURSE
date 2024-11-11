package application;

import metier.Compteur;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compteur c = new Compteur(300);
		c.incrementer(1000);
		c.decrementer(500);
		System.out.println(c.toString());
		

	}

}
