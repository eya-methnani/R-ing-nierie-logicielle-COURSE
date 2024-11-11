package aspects;

import metier.Produit;

public aspect QualityAspect {
	static int seuil =50;
	
	pointcut patch(Produit c, int mt): call(* metier..Produit.deposer(..)) && args(mt) && target(c);	
	void around(Produit c, int mt): patch(c,mt){
		int q=c.getQuantite()-mt;
		if(q>seuil) {
			proceed(c,mt);
		}		
		else {
			throw new RuntimeException("Produit sous seuil");
		}		

	
	
	}
	

}
