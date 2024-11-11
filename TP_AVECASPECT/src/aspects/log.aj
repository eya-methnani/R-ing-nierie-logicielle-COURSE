package aspects;

import metier.CompteBancaire;

public aspect log {
	pointcut logoperation(CompteBancaire c) : call (* etirer(..)) && target(c);
	before(CompteBancaire c) :logoperation(c) {
		System.out.println("avant retirer :" +c.getSolde());
		
	}
	after(CompteBancaire c) :logoperation(c) {
		System.out.println("apres retirer :" +c.getSolde());
		
	}

}
