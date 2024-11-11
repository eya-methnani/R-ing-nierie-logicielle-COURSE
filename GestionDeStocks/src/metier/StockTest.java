package metier;

//import java.util.Scanner;

public class StockTest {
	
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		Produit p = new Produit();
		p.setReference(111);
		p.setNom("hrissa");
		
		p.setQuantite(100);
		p.setDate(null);
		p.setPrix(1500);
		
		p.retirer(90);
		
		
	
		
	
		p.deposer(5);;
	
		

	}

}
