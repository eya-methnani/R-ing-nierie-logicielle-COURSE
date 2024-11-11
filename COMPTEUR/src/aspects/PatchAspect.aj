package aspects;
import metier.Compteur;

public aspect PatchAspect {
	pointcut patch(Compteur c, int m): call(* metier.Compteur.decrementer(..)) && args(m) && target(c);
	void around(Compteur c, int m): patch(c,m){
	if(m < c.getVal()) {
		proceed(c,m);
	}
	else {
	throw new RuntimeException("compteur insuffisant [pas="+m +", compteur ="+c.getVal()+"]");
	
	}
	}
}
