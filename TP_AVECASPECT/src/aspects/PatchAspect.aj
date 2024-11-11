package aspects;
import metier.CompteBancaire;


public aspect PatchAspect {
	
	pointcut patch(CompteBancaire c, double mt): call(* metier..CompteBancaire.rretirer(..)) && args(mt) && target(c);	
	void around(CompteBancaire c, double mt): patch(c,mt){
		if(mt<c.getSolde()) {
			proceed(c,mt);
		}		
		else {
			throw new RuntimeException("Solde insuffisant [mt="+mt
					+", Solde ="+c.getSolde()+"]");
		}		
	}
	
	pointcut patch2(CompteBancaire c, double mt): call(* metier..CompteBancaire.ddeposer(..)) && args(mt) && target(c);	
	void around(CompteBancaire c, double mt): patch2(c,mt){
		if(mt<30) {
			proceed(c,mt);
		}		
		else {
			throw new RuntimeException("Solde deposee insuffisant  [mt="+mt
					+", Solde ="+c.getSolde()+"]");
		}		
	}
}
