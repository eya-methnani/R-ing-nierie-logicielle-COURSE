package aspects;


import metier.CompteBancaire;


public aspect PatchAspect2 {
	
	pointcut patch(double mt): call(* metier..CompteBancaire.retirer(..)) && args(mt);
	
	void around(double mt): patch(mt){
		
		CompteBancaire cp = (CompteBancaire) thisJoinPoint.getTarget();
		
		if(mt<cp.getSolde()) {
			proceed(mt);
		}		
		else {
			throw new RuntimeException("Solde insuffisant [mt="+mt
					+", Solde ="+cp.getSolde()+"]");
		}
		
	}
}

