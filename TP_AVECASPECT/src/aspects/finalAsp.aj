package aspects;

import metier.CompteBancaire;

public aspect finalAsp {
	
    private static int CompteCount = 0;

	
	pointcut patch(): call(metier.CompteBancaire.new(..));
	
	Object around(): patch(){
		
		Object ret =proceed();
		
		if (CompteCount >= 3) {
            throw new IllegalStateException("Cannot create more than 3 Jeton instances");
        }
        CompteCount++;
        return ret; // Proceed with the actual constructor call
		
	}

}
