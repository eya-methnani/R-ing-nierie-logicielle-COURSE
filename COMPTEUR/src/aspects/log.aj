package aspects;

import metier.Compteur;

public aspect log {
	
	pointcut logoperation(Compteur c) : execution (* ncrementer(..)) && target(c);
	before(Compteur c) :logoperation(c) {
		System.out.println("avant execution incrementer :" +c.getVal());
		
	}
	after(Compteur c) :logoperation(c) {
		System.out.println("apres execution incrementer :" +c.getVal());
		
	}
	
	pointcut logoperation2(Compteur c) : execution (* ecrementer(..)) && target(c);
	before(Compteur c) :logoperation2(c) {
		System.out.println("avant execution decrementer :" +c.getVal());
		
	}
	after(Compteur c) :logoperation2(c) {
		System.out.println("apres execution decrementer :" +c.getVal());
	}
	
	pointcut logoperation3(Compteur c) : call (* ncrementer(..)) && target(c);
	before(Compteur c) :logoperation3(c) {
		System.out.println("avant call incrementer :" +c.getVal());
		
	}
	after(Compteur c) :logoperation3(c) {
		System.out.println("apres call incrementer :" +c.getVal());
		
	}
	
	pointcut logoperation4(Compteur c) : call (* ecrementer(..)) && target(c);
	before(Compteur c) :logoperation4(c) {
		System.out.println("avant call decrementer :" +c.getVal());
		
	}
	after(Compteur c) :logoperation4(c) {
		System.out.println("apres call decrementer :" +c.getVal());
	}
	

}
