package aspects;

import metier.CompteBancaire;

import java.util.logging.Logger;


public aspect log3 {


	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	pointcut logOperarion(CompteBancaire c): execution (* *.*.rretirer(..) )&& target(c);
	
	Object around(CompteBancaire c) : logOperarion(c){
		logger.info("=> Entrée dans la méthode retirer"+ c.getSolde());
		Object ret = proceed(c);
		logger.info("<= Sortie de la méthode retirer"+ c.getSolde());
		return ret;
	}
}
